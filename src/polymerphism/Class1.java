package polymerphism;

public class Class1 {

	public static void main(String[] args) {
		Class1 m1= new Class1();
		m1.addition();
		m1.addition(3.33444, 4.444444);
		m1.addition(500.44f, 600.66f); 
		m1.main();
		m1.main(100);
		}
	public static void main()
	{
	int a=10;
	System.out.println(" This is duplicate overloading main method");
	}
	public static void main(int a)
	{
	
	System.out.println(" This is duplicate overloading main method2");
	}
	
	public static void addition()
	{
		int a =100;
		int b=200;
		int sum=a+b;
		System.out.println(" the total additio is " + sum);
	}
	
	public void addition (double x, double y)
	{
		double division= y/x;
		System.out.println(" the total substraction is "+division);
		
	}
	public void addition(float x, float y)
	{
		float sub= y+x;
		System.out.println(" the total substraction is "+sub);
		
	}

}
