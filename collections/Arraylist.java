package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
	public static void main(String args[]){
		//Create ArrayList object.
		List<String> al = new ArrayList<String>();
 
		al.add("nouha");
		al.add("dove");
		al.add("leo");
		al.add("blue");
		al.add("black");
 
		System.out.println("taille du liste: " + al.size());
 
		System.out.println("les elements:");
		System.out.println(al);

		Iterator<String> it1=al.iterator();
		System.out.println("ArrayList elements " +
				"using iterator:");
		while(it1.hasNext()){  
		   System.out.println(it1.next());  
		} 
 
		al.add(2,"nova");
 
		al.remove(3);
		al.remove(4);
 
		System.out.println("taille apres supression "	+ al.size());
 
		System.out.println("les elements restants");
		System.out.println(al);

		Iterator<String> it2=al.iterator();
		System.out.println("with iterator:");
		while(it2.hasNext()){  
		   System.out.println(it2.next());  
		} 	
	}
}