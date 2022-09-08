package casting;

public class UpCasting {

	public static void main(String[] args) {
		SuperClass_Upcasting Super= new SuperClass_Upcasting();
		Super.upcasting();
		SubClass_Upcasting Sub= new SubClass_Upcasting();
		Sub.upcasting();
		
		SuperClass_Upcasting f= new SubClass_Upcasting();
		f.upcasting();
		
	

	}

}
