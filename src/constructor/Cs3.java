package constructor;

public class Cs3 {
	int a; // non static variable declearation
	int b; // non static variable declearation
	public Cs3()
	{
		a=10;//Assigning value to variable a within constructor
		b=50;//Assigning value to variable a within constructor
	System.out.println(" Running user difined constructor without parameter") ;
	}

	public static void main(String[] args) {
		Cs3 m3 = new Cs3();
		System.out.println(" value of a "+ m3.a);
		System.out.println(" value of b is "+ m3.b);
		
		

	}

}
