package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkset_test {

	public static void main(String[] args) {
	LinkedHashSet LHS = new LinkedHashSet<>();
	LHS.add("Sujata");
	LHS.add(9498);
	LHS.add(null);
	LHS.add(null);
	LHS.add(9498);
	LHS.add("Sujata");
	
	
	System.out.println(LHS);
	System.out.println(LHS.contains(null));
	System.out.println(LHS.isEmpty());
	System.out.println(LHS.remove("sujata"));
	System.out.println(LHS);
	
	System.out.println("=======byusing iteratior=======");
	Iterator IT = LHS.iterator();
	while(IT.hasNext())
	{
		System.out.println(IT.next());
	}
	System.out.println("=======byusing for each loop=======");
	for(Object o:LHS)
	{
		System.out.println(o);
	}

	}

}
