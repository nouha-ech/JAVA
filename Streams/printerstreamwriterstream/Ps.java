package streams;

import java.io.PrintStream;

public sealed class Ps {

	public static void main(String[] args) {

// PRINt stream print into direct text format 
		// no use of bytes arrays use tet format directly 
		// does not throw ioexception but we need to use check error
		// use methods print/printf (format)/println (line)/close
		String psfile = "C:\\Users\\PC\\Desktop\\java\\streams\\src\\streams\\testps.txt";
		PrintStream ps = new PrintStream(psfile);
		
		int age =22;
		ps.printf("my age is %d", age);

		ps.print("print test");
		
		ps.close();
		System.out.println("printing done");
	}

}
