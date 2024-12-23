package collection;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// creation arraylist
		
		ArrayList <String> fruits = new ArrayList<>();
		
		// ajout des elements
		
		fruits.add("pomme");
		fruits.add("banane");
		fruits.add("orange");
		
		// affichage
		
		System.out.println("list des fruits: " + fruits);
		
		
		// acces a elem specifique par index
		
		System.out.print("premier fruit est " + fruits.get(0));
		
		// suppression elem par sa valeur
		
		fruits.remove("banane");
		
		fruits.set(1, "Mangue");
        System.out.println("Après modification : " + fruits);

		
		// affichag apres suppression 
		
		System.out.println("list des fruits apres modification: " + fruits);
		
		
		// parcourir list avec boucle 
		
		System.out.println("fruits restants: " );
		
		for (String fruit : fruits ) {
			System.out.println(fruit);
		}
		
	}

}
