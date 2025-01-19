package streams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Pwr {

	public static void main(String[] args) throws FileNotFoundException {
		// prinwriter convert primitive data(int,char..) into text format
		// diff btw printstream and prinwriter?? is that printstream write raw bytes while printwriter convert thme
		// prinwriter write files more compatible with
		String file = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\testps.txt";
		PrintWriter pwr = new PrintWriter(file);
		
		int age =22;
		pwr.printf("my age is %d", age);

		pwr.print("print test");
		
		pwr.close();
		System.out.println("printing done");

	}

}
