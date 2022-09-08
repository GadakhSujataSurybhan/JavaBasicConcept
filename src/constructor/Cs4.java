package constructor;

public class Cs4 {  
	int a;
	int b;
	int c;
	
		public Cs4()
	{
			a=10;
			b=20;
			c=50;
			
		System.out.println(" this is userdefined without parameter constructor is running");
	}

	public static void main(String[] args) {
		
		Cs4 m1 = new Cs4();
		m1.addition();
		Cs4 m2= new Cs4(100);
		m2.addition();
	
		
		
		 

	}
	public Cs4(int num)
	{
		a= num;
		
		System.out.println("this is userdefined with one parameter constructor is running ");
	}
 public void addition()
 {
	 int sum= a+b+c;
	 System.out.println(" Addition is "+sum);
 }
}
