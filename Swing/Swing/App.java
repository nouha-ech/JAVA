package gestAbsence;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import java.awt.Font;

public class App {

    private JFrame frame;
    private static int clickCount = 0; // Move clickCount as an instance variable
    private JTextArea textArea; // Make textArea an instance variable to access in the button listener

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    App window = new App();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public App() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 641, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSplitPane splitPane = new JSplitPane();
        frame.getContentPane().add(splitPane, BorderLayout.CENTER);

        JButton btnNewButton = new JButton("click me!");
        splitPane.setLeftComponent(btnNewButton);
        btnNewButton.setSize(70, 40);
        btnNewButton.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
        btnNewButton.setForeground(UIManager.getColor("Button.background"));
        btnNewButton.setBackground(SystemColor.activeCaption);

        textArea = new JTextArea();
        splitPane.setRightComponent(textArea);
        textArea.setText("Clicks: " + clickCount);

       
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;

               
                if (clickCount >= 5) {
                    textArea.setText("ok STOP");
                    
                    btnNewButton.setEnabled(false);
                } else {
                    
                    textArea.setText("Clicks: " + clickCount);
                }
            }
        });
    }
}

