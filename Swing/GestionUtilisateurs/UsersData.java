package users;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UsersData extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final String DB_URL = "jdbc:mysql://localhost:4306/";
    private static final String USER = "root";
    private static final String PASSWORD = "Dashboard2024";

    private DefaultTableModel tableModel;

    public UsersData() {
        setTitle("gestion des utilisateurs");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

  JLabel label = new JLabel("Liste des utilisateurs");
                JButton addButton = new JButton("Add user");
        addButton.setPreferredSize(new Dimension(100, 30));  
        addButton.addActionListener(e -> openAddUserFrame(null));  
        JPanel northPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
      
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        northPanel.add(label, gbc);

     
        gbc.gridx = 700;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.EAST;
        northPanel.add(addButton, gbc);

      
        add(northPanel, BorderLayout.NORTH);

       
        JTable table = new JTable();
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"ID", "First Name", "Last Name", "Email", "Age", "Location", "Modify", "Delete"});
        table.setModel(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        class ButtonRenderer extends JButton implements TableCellRenderer {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public ButtonRenderer(String label) {
                setText(label);
                setOpaque(true);
            }

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                return this; 
            }
        }
        
     
        class ButtonEditor extends DefaultCellEditor {
            /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
			private String label;
            private int row;
            private JButton button;

            public ButtonEditor(JCheckBox checkBox, JTable table, String label) {
                super(checkBox);
                this.label = label;
                button = new JButton(label);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        fireEditingStopped();
                        row = table.getSelectedRow();

                        if (label.equals("Modify")) {
                            Integer userId = (Integer) table.getValueAt(row, 0);
                            openAddUserFrame(userId); 
                        } else {
                            Integer userId = (Integer) table.getValueAt(row, 0);
                            deleteUser(userId); // Delete user
                        }
                    }
                });
            }

            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                this.row = row;
                return button;  
            }

            @Override
            public Object getCellEditorValue() {
                return label;
            }
        }



       
        table.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer("Modify"));
        table.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox(), table, "Modify"));
        
        table.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer("Delete"));
        table.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(new JCheckBox(), table, "Delete"));

      
        try {
            setupDatabase();
            fetchData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

  
    public void openAddUserFrame(Integer userId) {
        JFrame userFrame = new JFrame(userId == null ? "Ajouter User" : "Modifier User");
        userFrame.setSize(400, 300);
        userFrame.setLayout(new GridLayout(6, 2));

        JTextField firstNameField = new JTextField();
        JTextField lastNameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField locationField = new JTextField();

        if (userId != null) { 
            try {
              
                fetchUserData(userId, firstNameField, lastNameField, emailField, ageField, locationField);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }

        userFrame.add(new JLabel("First Name:"));
        userFrame.add(firstNameField);
        userFrame.add(new JLabel("Last Name:"));
        userFrame.add(lastNameField);
        userFrame.add(new JLabel("Email:"));
        userFrame.add(emailField);
        userFrame.add(new JLabel("Age:"));
        userFrame.add(ageField);
        userFrame.add(new JLabel("Location:"));
        userFrame.add(locationField);

        JButton saveButton = new JButton(userId == null ? "Save" : "Update");
        saveButton.addActionListener(e -> {
            try {
                if (userId == null) {
                    addUser(firstNameField.getText(), lastNameField.getText(), emailField.getText(),
                            Integer.parseInt(ageField.getText()), locationField.getText());
                } else {
                    updateUser(userId, firstNameField.getText(), lastNameField.getText(), emailField.getText(),
                            Integer.parseInt(ageField.getText()), locationField.getText());
                }
                userFrame.dispose();
                refreshTable();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        userFrame.add(saveButton);

        userFrame.setVisible(true);
    }

  
    private void fetchUserData(int userId, JTextField firstNameField, JTextField lastNameField, JTextField emailField,
                               JTextField ageField, JTextField locationField) throws SQLException {
        String fetchDataSQL = "SELECT * FROM users WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(DB_URL + "testsss", USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(fetchDataSQL)) {

            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                firstNameField.setText(resultSet.getString("firstname"));
                lastNameField.setText(resultSet.getString("lastname"));
                emailField.setText(resultSet.getString("email"));
                ageField.setText(String.valueOf(resultSet.getInt("age")));
                locationField.setText(resultSet.getString("location"));
            }
        }
    }

   
    private void setupDatabase() throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            Statement statement = connection.createStatement();

            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS testsss";
            statement.executeUpdate(createDatabaseSQL);

            String useDatabaseSQL = "USE testsss";
            statement.executeUpdate(useDatabaseSQL);

            String createTableSQL = """
                    CREATE TABLE IF NOT EXISTS users (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        firstname VARCHAR(50),
                        lastname VARCHAR(50),
                        email VARCHAR(100),
                        age INT,
                        location VARCHAR(100)
                    )
                    """;
            statement.executeUpdate(createTableSQL);
        }
    }

    
    private void fetchData() throws SQLException {
        tableModel.setRowCount(0); 
        String fetchDataSQL = "SELECT * FROM users";
        try (Connection connection = DriverManager.getConnection(DB_URL + "testsss", USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(fetchDataSQL)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                int age = resultSet.getInt("age");
                String location = resultSet.getString("location");

                Object[] row = {
                    id,
                    firstName,
                    lastName,
                    email,
                    age,
                    location,
                    "Modify",  
                    "Delete"
                };

                tableModel.addRow(row);
            }
        }
    }

  
    private void addUser(String firstName, String lastName, String email, int age, String location) throws SQLException {
        String insertSQL = "INSERT INTO users (firstname, lastname, email, age, location) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(DB_URL + "testsss", USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setInt(4, age);
            preparedStatement.setString(5, location);
            preparedStatement.executeUpdate();
        }
    }

   
    private void updateUser(int userId, String firstName, String lastName, String email, int age, String location) throws SQLException {
        String updateSQL = "UPDATE users SET firstname = ?, lastname = ?, email = ?, age = ?, location = ? WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(DB_URL + "testsss", USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setInt(4, age);
            preparedStatement.setString(5, location);
            preparedStatement.setInt(6, userId);
            preparedStatement.executeUpdate();
        }
    }

    
    public void deleteUser(int id) {
        try (Connection connection = DriverManager.getConnection(DB_URL + "testsss", USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            refreshTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    private void refreshTable() {
        try {
            fetchData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UsersData frame = new UsersData();
            frame.setVisible(true);
        });
    }
}
