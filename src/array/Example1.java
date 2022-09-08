package array;

public class Example1 {

	public static void main(String[] args) {
		
		String statement[] = new String [6];
		statement[0] = "I";
		statement [1]= "Love";
		statement [2]= "my";
		statement [3]= "mom";
		statement [4]= "and";
		statement [5]= "dad";
	     
	for(int i=0; i<=statement.length-1; i++)
	{
		System.out.println("Total statment is "+statement[i]);
		
	}
	int addition[] = new int [9];
	addition[0]= 10;
	addition[1]= 20;
	addition[2]= 30;
	addition[3]= 40;
	addition[4]= 50;
	addition[5]= 60;
	addition[6]= 70;
	addition[7]= 80;
	addition[8]= 90;
	
	for(int i=0; i<=addition.length-1; i++)
	{
		System.out.println("Total number is "+addition[i]);
	}
	for(int i=8; i<=addition.length-1; i--)
	{
		System.out.println("Total number is "+addition[i]);
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
	}

}
