package array;

public class multidimension_array {

	public static void main(String[] args) {
		int test1 [] [] = new int [2][2];
	    test1 [0] [0]= 2;
	    test1 [0] [1]= 3;
	    test1 [1] [0]= 4;
	    test1 [1] [1]= 5;
	    
	    for(int i=0;i<=test1.length-1; i++ )
	    {
	    	for(int j=0;j<=test1.length-1; j++)
	    	{
	    		System.out.print(test1[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    
	  
	  char test2[][] = {{'a','b','c'},{'e','f','g'}};
	    for(int i=0;i<=2; i++ )
	    {
	    	for(int j=0;j<=2; j++)
	    	{
	    		System.out.print(test2[i][j]+" ");
	    	}
	    	System.out.println();
	    } 
	    
	}
}
