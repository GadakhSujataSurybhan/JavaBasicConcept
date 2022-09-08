package control_statement;

public class Nasted_If_else_Study {

	public static void main(String[] args) {
		String username= "Velocity";
		String Password=" velocity@123";
		int chapcha=1234;
		
		if(username=="Velocity")
		{
			System.out.println("your username is correct, Please enter password");
			if( Password==" velocity@123")
			{
				System.out.println("Password is correct,Please enter captcha");
				if(chapcha==1234)
				{
					System.out.println("Signing in, welcome to home page");
				}
				else {
					System.out.println("your chapcha is incorrect");
				}
			}
			else {
				System.out.println("your password is incorrect");
			}
		}
		else {
			System.out.println("your username is incorrect");
		}
		
	}
	

}
