package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetTest {

	public static void main(String[] args) {
	HashSet HS = new HashSet<>();
	HS.add("Sujata");
	HS.add(9498);
	HS.add(null);
	HS.add(9498);
	HS.add(null);
	HS.add("Gadakh");
	
	
	System.out.println(HS);
	System.out.println(HS.contains("Gadakh"));
	System.out.println(HS.isEmpty());
	System.out.println(HS.remove("Gadakh"));
	 
	
	System.out.println("=======by using iteratior======");
	 Iterator IT = HS.iterator();
	 while(IT.hasNext())
	 {
		 System.out.println(IT.next());
	 }
	 System.out.println("=======by using for each loop======");
	 for(Object o:HS)
	 {
		 System.out.println(o);
	 }
	 
	}
	
}
