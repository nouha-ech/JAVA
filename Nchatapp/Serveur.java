package chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class Serveur {
    private ServerSocket serverSocket;

    public Serveur(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer() {
        try {
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                System.out.println("Un nouveau client a été connecté");
                ClientHandler clientHandler = new ClientHandler(socket);

                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeServerSocket(); // Ensure server socket is closed
        }
    }

    public void closeServerSocket() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        int port = 1234;
        ServerSocket serverSocket = new ServerSocket(port);
        serverSocket.setReuseAddress(true); // Allow reusing the port if the server is restarted
        Serveur serveur = new Serveur(serverSocket);
        serveur.startServer();
    }
}
