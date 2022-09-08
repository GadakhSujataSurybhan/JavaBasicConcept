package super_keyword;

public class ClassB extends ClassA{
	
	 int a=100;
	 int b=20;
	 
	

	public static void main(String[] args) {
		 ClassB m1 = new ClassB();
		 m1.series1();
		
		
		}
	
	public void series1()
	{

		int a=10;
		System.out.println(" the value of local veriable a of class B is "+a);
		System.out.println(" the value of globle veriable a of class B is "+this.a);
		System.out.println(" the value of globle veriable a of class A is "+super.name);
		
	}
	
	public static void demo()
	{
		ClassB m2 = new ClassB();
		
		
		
		System.out.println("my name is sujata "+ m2.b);
	}

}
