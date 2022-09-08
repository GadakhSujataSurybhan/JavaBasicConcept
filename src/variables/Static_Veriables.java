package variables;

public class Static_Veriables {
	static int a=60;  // global static veriables

	public static void main(String[] args) {
		addition();
		System.out.println(" the value of a is "+a);
		System.out.println("The value of c is "+Static_Veriable_diff_class.c);
		

	}
	public static void addition()
	{
		int b=90;
		int sum= a+b;
		System.out.println("the addition of static veriable is "+ sum);
		System.out.println(" the value of b is "+b);
	}

}
