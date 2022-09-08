package string_study;

public class Study_Example {

	public static void main(String[] args) {
		// without using new keyword
		String s="Sujata";
		
		// without using new keyword
		String s1 = new String ("Velocity ");
		String s2 = new String ("VELOCITY1");
		String s3= new String ("   ");
		String s4= new String (" ");
		String s5= new String("Class ");
		String s6= new String ("weeek");
		
		
	    System.out.println(s1.length());
	    System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.equals(s1));
		System.out.println(s1.equalsIgnoreCase(s2));
	    System.out.println(s1.contains("cr"));
		System.out.println(s2.contains("VEL "));
     	System.out.println(s4.isBlank());
    	System.out.println(s1.isBlank());
    	System.out.println(s3.isEmpty());
     	System.out.println(s2.startsWith("ELOCITY1"));
     	System.out.println(s2.startsWith("OC", 3));
    	System.out.println(s1.substring(9));
     	System.out.println(s2.substring(2, 5));
    	System.out.println(s1.concat(s5).concat(s2));
    	System.out.println(s.charAt(3));
     	System.out.println(s2.indexOf("LO"));
     	System.out.println(s2.indexOf("CITY1"));
    	System.out.println(s6.lastIndexOf("ek"));
	   System.out.println(s6.replace("ee", "mi"));

	
     	
     	

		
    	
		


	}

}
