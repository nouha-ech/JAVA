package streams;

public class StringReader {

	public StringReader(String s) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// stringreader read from string not file
		// read in form of char
		// has many methods string read one char then read(char[] arr) / mark/ ready/ reset

		String s = "this is a string";
		StringReader sr = new StringReader(s);
		for(int i=0;i<20;i++) {
			int x = sr.read();
			System.out.println((char) x);
		}
	}

}
