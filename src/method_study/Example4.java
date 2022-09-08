package method_study;

public class Example4 {

	public static void main(String[] args) {
	
		
		System.out.println(" this is non static method");
		Example4 object= new Example4();
		object.statement1();
		Example5 obj5= new Example5();
		obj5.statement3();
		obj5.statement4();
		
	}
	public void statement1()
	{
		System.out.println(" this is non static statement1 is running");
	}

}
