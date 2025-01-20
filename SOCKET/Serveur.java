package socket.atelier;
import java.io.*;
import java.net.*;
public class Serveur {
	    public static void main(String[] args) {
	        int port = 1233;
	        try (ServerSocket serverSocket = new ServerSocket(port)) {
	            
	            Socket socket = serverSocket.accept();
	            
	            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	            
	            int a = Integer.parseInt(in.readLine());
	            int b = Integer.parseInt(in.readLine());
	            int c=a*b;
	            out.println(a+" X " +b+ " = "+c);
	            socket.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

