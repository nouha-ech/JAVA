package vehicule;

public class test {

	public static void main(String[] args) {
		Voiture v = new Voiture("toyota","gt86",1950,200000);
		v.setannee(2001);
		v.toString();
		System.out.println(v.toString());
		v.setprix(2500000);
		v.setmodele("corolla");
		v.setmarque("toyota");
		System.out.println(v.toString());


	}

}
