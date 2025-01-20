package socket.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket server;
    private Socket socket;
    private BufferedReader br;
    private PrintWriter out;

    private JFrame frame;
    private JTextArea chatArea;
    private JTextField messageField;
    private JButton sendButton;

    public Server() {
        initializeUI();

        try {
            server = new ServerSocket(7777); // Listening on port 7777
            appendToChatArea("Server is ready. Waiting for connection...");
            
            socket = server.accept(); // Accept client connection
            appendToChatArea("Client connected!");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            startReading();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initializeUI() {
        frame = new JFrame("Server");
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

    private void appendToChatArea(String message) {
        chatArea.append(message + "\n");
    }

    private void sendMessage() {
        String message = messageField.getText().trim();
        if (!message.isEmpty()) {
            appendToChatArea("Server: " + message);
            out.println("Server: " + message);
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
            } catch (IOException e) {
                appendToChatArea("Connection closed.");
            }
        };

        new Thread(reader).start();
    }

    public static void main(String[] args) {
        new Server();
    }
}
