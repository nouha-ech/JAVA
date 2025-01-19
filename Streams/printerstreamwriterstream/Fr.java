package streams;

import java.io.FileReader;
import java.io.IOException;

public class Fr {

	public static void main(String[] args) throws IOException { // important!!
		// file reader is not using bytes but char
		//abstract class
		// subclasses of reader filereader/Stringreader/bufferedreader/inputstreamreader
         // methods ready()/ read(char[] arr) close(), skip()
		String file = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\test.txt";
		FileReader fr = new FileReader(file);
		
		System.out.println("file ready to be printed??" + fr.ready()); // ioexception
		
		// read file with fr filereader adn using char arr
		
		char[] arr = new char[50];
		
		fr.read(arr);
		
		System.out.println(arr); 
		
		fr.close();
	}

}


