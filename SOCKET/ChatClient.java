package socket.tpchat;

	import java.io.*;
	import java.net.*;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class ChatClient {
	    private static JTextArea chatArea;
	    private static JTextField inputField;
	    private static JButton sendButton;
	    private static PrintWriter out;

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Client Chat");
	        chatArea = new JTextArea(20, 40);
	        chatArea.setEditable(false);
	        inputField = new JTextField(30);
	        sendButton = new JButton("Envoyer");

	        JPanel panel = new JPanel();
	        panel.add(inputField);
	        panel.add(sendButton);

	        frame.setLayout(new BorderLayout());
	        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
	        frame.add(panel, BorderLayout.SOUTH);

	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.pack();
	        frame.setVisible(true);

	        try (Socket socket = new Socket("192.168.1.14", 12345)) {
	            chatArea.append("Connecté au serveur.\n");

	            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            out = new PrintWriter(socket.getOutputStream(), true);

	            sendButton.addActionListener(e -> sendMessage());
	            inputField.addActionListener(e -> sendMessage());

	            String message;
	            while ((message = in.readLine()) != null) {
	                chatArea.append("Serveur : " + message + "\n");
	            }
	        } catch (IOException e) {
	            chatArea.append("Erreur : " + e.getMessage() + "\n");
	        }
	    }

	    private static void sendMessage() {
	        String message = inputField.getText();
	        if (!message.isEmpty()) {
	            chatArea.append("Client : " + message + "\n");
	            out.println(message);
	            inputField.setText("");
	        }
	    }
	}