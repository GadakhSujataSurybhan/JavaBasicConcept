package method_study;

public class Mathoperation1 {

	public static void main(String[] args) {
		addition();
		Mathoperation1 m1= new Mathoperation1();
		m1.addition1();
		m1.addition2(50.555, 60.666);
			
	}

	public static void addition()
	{
		double a= 10.111;
		double b=20.222;
		double sum=a+b;
		
		System.out.println(" addition is "+ sum);
	}
	public void addition1()
	{
		double a= 10.111;
		double b=20.222;
		double sum=a+b;
		
		System.out.println(" addition is "+ sum);
	}
	public void addition2(double a,double b)
	{
		double sum=a+b;
		
		System.out.println(" addition is "+ sum);
	}
	
	
		
	
	
}
