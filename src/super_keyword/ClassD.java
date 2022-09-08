package super_keyword;

public class ClassD extends ClassC {
	String name =" ganesh";

	public static void main(String[] args) {
		ClassD m1= new ClassD();
		m1.demo2();

	}
	
	
public void demo2()
{
	String name= " Reneka";
	System.out.println(" hello my name is "+this.name);
	System.out.println("hello my name is" + super.name);
}

}
