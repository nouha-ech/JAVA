package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Br {

	public static void main(String[] args) throws IOException {
		// br is subclass of filereader
		// efficcient way of writing thanks to te buffer inside with +8k bytes
		// used with filereader
		// since filereader read char[]
		// bufferedreadr also read char[]  not bytes but more efficiently than filereaderalone and faster
		// reading operation not done char by char

		String file = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\test.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			  // ioexception
			// lets store ito string to show on console
			
		//	String data = br.readLine();  // only read one line!!
			// System.out.println(data);
			// so read just one line at a time but faster
			
			// so to print whole file need a while loop
			String d = "";
			while ((d = br.readLine())!= null) {  // must use null here bc string not byte
				System.out.println(d);
			}
			
			br.close(); // must close
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
