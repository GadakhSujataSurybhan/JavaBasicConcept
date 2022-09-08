package casting;

public class SuperClass_Upcasting {

	public void upcasting()
	{
		System.out.println("upcasting method of superclass");
	}
	public static void main(String[] args) {
		SubClass_Upcasting m= (SubClass_Upcasting) new SuperClass_Upcasting();
		m.upcasting();
		
		
		
		
		
	}
}
