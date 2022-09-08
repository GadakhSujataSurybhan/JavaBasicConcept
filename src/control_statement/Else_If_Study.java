package control_statement;

public class Else_If_Study {

	public static void main(String[] args) {
		int marks= 78;
		if(marks==40)
		{
			System.out.println(" i am pass");
		}
		else if(marks<50 && marks>60)
		{
			System.out.println(" i am pass with Second class");
		}
		else if(marks<60 && marks>75)
		{
			System.out.println(" i am pass with  class");
		}
		
		else if(marks>75)
		{
			System.out.println(" i am pass with Disctions class");
		}
		
		else {
			System.out.println(" i am failed");
		}
		
	}

}
