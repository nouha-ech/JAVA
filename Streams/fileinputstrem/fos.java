package streams;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fos {

	public static void main(String[] args) {
		
	String data = "test writing data";
	String file = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\testfos.txt";
	try (OutputStream output = new FileOutputStream(file)) {
		
		byte[] arr = data.getBytes();
		output.write(arr);
		// must close!!
		System.out.println("writting done");
		output.close();
		System.out.println("output got closed");
	} catch (IOException e) {
		System.out.println("erreur");
		e.printStackTrace();
	}
		

	}

}
