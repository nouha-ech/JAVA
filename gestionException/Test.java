package gestException;

public class Test {
	public static void main(String[] args) { 
		Person[] classe = new Person[3];
		Person e1 = new Person("nouha"); 
		Person e2 = new Person("ahmad");
		Person e3 = new Person("leo");
		Person[] classe1 = {e1,e2,e3}; 

		System.out.println(classe1[0].getname()); 
		System.out.println(classe1[1].getname()); 
		System.out.println(classe1[2].getname());
		} 
}