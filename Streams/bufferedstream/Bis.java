package streams;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bis {

	public static void main(String[] args) throws IOException {
		String bisfile = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\testfos.txt";
		try {
			// fileinputstream is a arg inside buffstream
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(bisfile));
			int i = bis.read(); // i is presentation of characters
			System.out.println("first character is " + i ); // char as number
			System.out.println("first character is " + (char) i );  // to cast as a char to see the letter
			
			// to read file we need a loop 
			
			while(i!=-1) {
				System.out.print((char) i ); 
				i = bis.read();
			}
			bis.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
