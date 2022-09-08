package array;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		String test1[]= {"Sujata","12345","Puja12","H","surybhan",};
		
		System.out.println("============");
		for(int i=0;i<=test1.length-1; i++) 
		{
			System.out.println(test1[i]);
			
		}
		System.out.println("============");
		Arrays.sort(test1);
		for(int i=0;i<=test1.length-1; i++) 
		{
			System.out.println(test1[i]);
			
		}
		System.out.println("============");
		for(int i=test1.length-1;i>=0;i--) 
		{
			System.out.println(test1[i]);
			
		}
		
		
		
		
		
		
		

	}

}
