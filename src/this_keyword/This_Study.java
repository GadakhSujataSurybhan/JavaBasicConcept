package this_keyword;

public class This_Study {
	int a=10;
	static int b=20;
	

	public static void main(String[] args) {
		 This_Study m1 = new This_Study();
		 m1.demo();
	}
	
	public void demo()
	{
		int a=100;
		int sum =100-a;
		System.out.println("the value of a is "+a);
		System.out.println("the value of a is "+ this.a);
		System.out.println(" the value of sum "+ sum);
		
		
	}
	
	

}
