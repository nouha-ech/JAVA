package entreprise;

public class Test {
	public static  void main (String[] args) {
		Employe e1= new Employe ("s","ceo",1000000,"bbb111");
		System.out.println(e1.toString());
		e1.setNom("salma");
		e1.toString();
		Employe e2 = new Employe();
		e2.setPoste("vice");
		e2.toString();
		
		Manager m1 = new Manager ("Alice", "manager", 5000.0 ,"bbb11", 1000);
		m1.setNom("soso");
		
		Technicien t1 = new Technicien("ss", "TECH", 5000.0 ,"b111", 13);
		System.out.println(t1.toString());
		System.out.println(t1.getHeure());
		
	}

}
