package inheritance;

public class Sinlge_Inheritance_study {

	public static void main(String[] args) {
		Father_Superclass F1 = new Father_Superclass();
		F1.attitude();
		F1.look();
		
		Daughter_Subclass d1 = new Daughter_Subclass();
		d1.attitude();
		d1.look();
		d1.hairstyle();
		
		
		
		
		
		Father_Superclass.happiness();
		Daughter_Subclass.hairstyle();
		

	}

}
