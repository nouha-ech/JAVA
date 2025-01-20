package socket.atelier;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
    	 String host = "localhost";
         int port = 1233;
        try (Socket socket = new Socket(host, port)) {
          
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
           
            out.println(5);
            out.println(15);
            System.out.println("Réponse du serveur : " + in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
