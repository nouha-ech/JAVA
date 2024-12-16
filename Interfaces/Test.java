package abstractcltp;

import abstractcltp.Animal;
import abstractcltp.Humain;

public class Test {

	public static void main(String[] args) {
		
Humain hmed = new Humain("hmed", 19, "male");
		
		Animal leo = new Animal("leo", 4, "male");
		
		leo.manger();
		hmed.manger();
		

	}

}
