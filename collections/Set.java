package set;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String args[]){
		HashSet<String> h = new HashSet<String>();
 
		h.add("spidy");
		h.add("robin");
		h.add("batman");
		h.add("hulk");
		System.out.println("the heroes :");
		System.out.println(h);
 
		Iterator<String> iterator=h.iterator();
		System.out.println("with iterator:");
		while(iterator.hasNext()){  
		   System.out.println(iterator.next());  
		}  
	}
}
