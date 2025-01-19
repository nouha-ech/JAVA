package streams;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Fis {

	public static void main(String[] args) {
		String file = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\test.txt";
		try (InputStream input = new FileInputStream(file)) { // try catch !!!
			
			// count num of char
			int count = input.available();
			System.out.println(count);
			
			// read but have put in arr of bytes
			
			byte[] content = new byte[50];
			input.read(content);
			
			// turn arr of bytes into string
			
			String contostring = new String(content);
			System.out.println("content of file: " + contostring);
			
			// must close!!
			input.close();
			
		} catch (IOException e) {
			System.out.println("erreur");
			e.printStackTrace();
		}
		
		
		// test fos!! 
		
		String fos = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\testfos.txt";
try (InputStream input = new FileInputStream(fos)) { 
	
			
			
			
			// test fos!! 
			
			int count2 = input.available();
			System.out.println(count2);
			
			// read but have put in arr of bytes
			
			byte[] contentfos = new byte[50];
			input.read(contentfos);
			
			// turn arr of bytes into string
			
			String fosstring = new String(contentfos);
			System.out.println("content of fos: " + fosstring);
			// must close!!
			input.close();
			
		} catch (IOException e) {
			System.out.println("erreur");
			e.printStackTrace();
		}

	}

}
