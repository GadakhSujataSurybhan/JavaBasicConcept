package exceptionInJava;

public class ArthmaticException_study {

	public static void main(String[] args) {
		int a=20;
		int b= 0;
		try {
			
		int div=a/b;
		System.out.println(div);
			
		} catch (ArithmeticException e) {
			System.out.println("b can't be zero");
		}
System.out.println("hello everyone");
	}

}
