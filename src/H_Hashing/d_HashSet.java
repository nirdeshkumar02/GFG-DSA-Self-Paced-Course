package H_Hashing;
import java.util.*;

public class d_HashSet {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("GFG");
		h.add("Courses");
		h.add("are");
		h.add("best");
		System.out.println(h);
		System.out.println(h.contains("GFG"));
		Iterator<String> i = h.iterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");
		System.out.println(h.size());
		h.remove("are");
		System.out.println(h.size());
		for(String e : h)
			System.out.println(e+" ");
		System.out.println("\n"+h.isEmpty());
		h.clear();
		System.out.println(h);
		
		
	}

}
