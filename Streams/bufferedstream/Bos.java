package streams;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Bos {

	public static void main(String[] args) throws IOException {
		String data = "test buffer writing data";
		String bosfile = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\testbos.txt";

		
		
		try {
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(bosfile));
			bos.write(data.getBytes());
			bos.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
