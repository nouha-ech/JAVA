package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bwr {

	public static void main(String[] args) {
		// sub class of writer
		// user buffer thats why more efficcient 
		// using a buffer reduce num of io operation which make program faster 
		
		// also write char[]
		
String file = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\testbiffw.txt";
		
		
			try {
				BufferedWriter bwr = new BufferedWriter(new FileWriter(file));
				bwr.write("test bufferwriter first line");
				bwr.write("test another line");
				bwr.close();
				System.out.println("bufferedwriter close" ); 
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}
