package string_study;

 public class test1
{  
private static String s= "Javatpoint";  
//Static and nested class  
static class StaticNestedClass  
{  
//non-static method of the nested class  
public void show()   
{  
//prints the string defined in base class  
System.out.println(s);   
}  
}  
public static void main(String args[])  
{  
test1.StaticNestedClass obj = new test1.StaticNestedClass();  
//invoking the method of the nested class  
obj.show();  
	

}  
}  
