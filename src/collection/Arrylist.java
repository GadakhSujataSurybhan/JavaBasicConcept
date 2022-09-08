package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylist {

	public static void main(String[] args) {
		ArrayList arc = new ArrayList<>();
		arc.add("Sujata");
		arc.add(9498);
		arc.add(7.93);
		arc.add('A');
		arc.add("Gadakh");
		System.out.println(arc);
		System.out.println(arc.size());
		arc.add(1, "Suryabhan");
		System.out.println(arc);
//		arc.remove(2);
//		System.out.println(arc);
//		System.out.println(arc.isEmpty());
//		System.out.println(arc.contains(1234));
//		System.out.println(arc.get(1));
		System.out.println("=========By using for loop========");
		for(int i=0; i<=arc.size()-1; i++)
		{
			System.out.println(arc.get(i));
		}
		System.out.println("=========By using iterator========");
		Iterator IT = arc.iterator();// created iterator
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
		
		System.out.println("=========By using for each========");

		for(Object o:arc)
		{
			System.out.println(o);
		}
		

	}

}
