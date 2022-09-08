package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		list.add("sujata");
		list.add("list");
		list.add(null);
		list.add(null);
		list.add(9/4);
		
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		list.add(0, "gadakh");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("=====by using iteratior=======");
		Iterator IT = list.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
		System.out.println("=======by using for loop===========");
		for(int i=0;i<=list.size()-1; i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("=======by using for each loop==========");
		for(Object o:list)
		{
			System.out.println(o);
		}
		System.out.println("=======by using listeteratior==========");
		ListIterator LL = list.listIterator();
		while(LL.hasNext())
		{
			System.out.println(LL.next());
		} 
	
		

	}

}
