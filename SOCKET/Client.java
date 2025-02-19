package socket.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private Socket socket;
    private BufferedReader br;
    private PrintWriter out;

    private JFrame frame;
    private JTextArea chatArea;
    private JTextField messageField;
    private JButton sendButton;

    public Client() {
        initializeUI();
        connectToServer();
    }

    private void initializeUI() {
        frame = new JFrame("Client");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new BorderLayout());
        frame.add(inputPanel, BorderLayout.SOUTH);

        messageField = new JTextField();
        inputPanel.add(messageField, BorderLayout.CENTER);

        sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        inputPanel.add(sendButton, BorderLayout.EAST);

        frame.setVisible(true);
    }

    private void connectToServer() {
        try {
            socket = new Socket("127.0.0.1", 7777);
            appendToChatArea("Connected to server.");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            startReading();
        } catch (Exception e) {
            appendToChatArea("Unable to connect to server.");
            e.printStackTrace();
        }
    }

    private void appendToChatArea(String message) {
        chatArea.append(message + "\n");
    }

    private void sendMessage() {
        String message = messageField.getText().trim();
        if (!message.isEmpty()) {
            out.println("Client: " + message);
            appendToChatArea("You: " + message);
            messageField.setText("");
        }
    }

    private void startReading() {
        Runnable reader = () -> {
            try {
                String message;
                while ((message = br.readLine()) != null) {
                    appendToChatArea(message);
                }
            } catch (Exception e) {
                appendToChatArea("Connection closed.");
            }
        };

        new Thread(reader).start();
    }

    public static void main(String[] args) {
        new Client();
    }
}

