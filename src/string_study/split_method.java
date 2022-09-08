package string_study;

import java.util.Iterator;

public class split_method {

	public static void main(String[] args) {
		String s= "I_Love_My_Self";
		String refers="_";
		String[] output1 = s.split(refers);
		for(int i=0; i<=output1.length-1; i++)
		{
			System.out.println(output1[i]);
		}
	

	}

}
