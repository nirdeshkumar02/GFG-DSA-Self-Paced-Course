package H_Hashing;
import java.util.*;
public class e_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<>();
			m.put("gfg", 10);
			m.put("are", 20);
			m.put("courses", 18);
			m.put("best", 19);
			System.out.println(m);
			System.out.println(m.size());
			for(Map.Entry<String, Integer> e: m.entrySet())
				System.out.println(e.getKey()+" "+e.getValue());
			if(m.containsKey("are"))
				System.out.println("True");
			else
				System.out.println("False");
			m.remove("gfg");
			System.out.println(m.size());
			if(m.containsValue(19))
				System.out.println("Yes");
			else
				System.out.println("No");
			System.out.println(m.get("courses"));
			System.out.println(m.get("practice"));
	}

}
