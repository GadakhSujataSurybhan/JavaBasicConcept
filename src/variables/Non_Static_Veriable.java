package variables;

public class Non_Static_Veriable {
	int d= 100;  // Non-static globle veriable

	public static void main(String[] args) {
		
		Non_Static_Veriable m1 = new Non_Static_Veriable();
		m1.mutiplication();
		System.out.println(" the value of d is "+m1.d);
		Non_static_Veriables_diffclass m2 = new Non_static_Veriables_diffclass();
		System.out.println(" the value of non static veriable e is "+ m2.e);
	}
	public void mutiplication()
	{
		int c=80;
		int mutiplication = c*d;
		System.out.println(" the muliplication of non-static veriables is "+ mutiplication);
		
	}

}
