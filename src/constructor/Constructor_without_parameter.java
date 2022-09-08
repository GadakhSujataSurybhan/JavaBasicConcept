package constructor;

public class Constructor_without_parameter {
	int a=100;
	int b=200; 
	public Constructor_without_parameter()
	{
		System.out.println(" running user defined without parameter constructor");
	}


	public static void main(String[] args) {
		
		Constructor_without_parameter c3= new Constructor_without_parameter();
		System.out.println(" the value of a is "+ c3.a);
		System.out.println(" the value of a is "+ c3.b);
    

	}

}
