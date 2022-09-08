package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorlist {

	public static void main(String[] args) {
		Vector V = new Vector();
		V.add(null);
		V.add("sujata");
		V.add(null);
		V.add(9498);
		V.add(9498);
		V.add("Vector");
		
		System.out.println(V);
		System.out.println(V.contains(null));
		System.out.println(V.size());
		V.add(0, "Gadakh");
		System.out.println(V);
		System.out.println(V.get(3));
		System.out.println(V.isEmpty());
		
		System.out.println("=========By using iterator========");
		Iterator IT=V.iterator();
		 while(IT.hasNext())
		 {
			 System.out.println(IT.next());
		 }
		 System.out.println("=========By using for loop========");
		 for(int i=0;i<=V.size()-1; i++)
		 {
			 System.out.println(V.get(i));
		 }
		 System.out.println("=========By using for each========");
		for(Object o:V)
		{
			System.out.println(o);
		}
		System.out.println("========by using listiterator====");
		ListIterator list = V.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("=======by using enumareation====");
		Enumeration enu = V.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	
	
		
		

}
}


