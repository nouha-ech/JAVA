package streams;

import java.io.FileWriter;
import java.io.IOException;

public class Fwr {

	public static void main(String[] args) throws IOException {
		// writer is abstract superclass of io package
		// since its abstract cant use directly we need subclasses
		// has 4 subclasss filewriter/Stringwriter/bufferedwriter/ inputstreamwriter	
		// has multiple methods 
		// write(char[] arr)/ write(String data)/ flush()/ append()/ close()
		String file = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\testfw.txt";
		FileWriter fw = new FileWriter(file);
		
		
		fw.write("write this");
		// must close!!
		System.out.println("filewritting done");
		fw.close();
		System.out.println("fw got closed");
	}

}
