package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
    TreeSet ts= new TreeSet();
		
		ts.add("xyz");
		ts.add("velocity");
		ts.add("abc");
		ts.add("pune");
		ts.add("xyz");
		ts.add("XXX");
		ts.add("aaa");
		ts.add("AAA");
		//ts.add(null);--> will throw nullpointer exception
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("abc"));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object o:ts)
		{
			System.out.println(o);
		}


	}

}
