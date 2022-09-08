package access_modifier;

public class AM2 {
	
	 int Roll_num=35;
	 private String name= "Sujata";
	 public char grade= 'A';
	 protected float per= 6.77f;
	 
	 
	 
	 

	public static void main(String[] args) {
		AM2 d1 = new AM2();
		d1.demo1();
		d1.demo2();
		demo3();
		demo4();
		
		
		

	}
	void demo1()
	{
		System.out.println("visibility--> default--> within package only demo1 method of AM2 Class");
	}
	
	private void demo2()
	{
		System.out.println("visibility-->private-->within class only demo2 method of of AM2 class");
	}
	 public static void demo3()
	 {
		 System.out.println("visibility--> public--> within project demo3 method of AM2 class");
	 }
	 
	 protected static void demo4()
	 {
		 System.out.println("visibility-->protected--> within package+inheritance for outside package demo4 method of AM2 class");
	 }
	
	



}
