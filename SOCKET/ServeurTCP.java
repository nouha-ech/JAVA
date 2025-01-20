package socket.chat;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class ServeurTCP {



	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        try (ServerSocket serverSocket = new ServerSocket(1236)) {
	          
	            Socket socket = serverSocket.accept();
	         
	            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	            String a;
	            do{
	               a= in.readLine();
	               System.out.println("Client:"+a);
	               if(a.equalsIgnoreCase("Bye")){
	                out.println("Bye"); break;
	               }
	               System.out.println("Entrer votre reponse");
	               out.println(sc.nextLine());
	            }while(true);
	           
	            socket.close();
	            sc.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}