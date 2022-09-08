package interface_study;

public class Daughter_Class implements Mother_Interface,Father_Interface {
	
	int a=10;
	final int c=20;

	public static void main(String[] args) {
		
		Daughter_Class d = new Daughter_Class();
		d.attitude();
		d.kindness();
		d.happiness();
		d.money();
		d.city();
		

	}

	
	@Override
	public void attitude() {
		a=a+10;
		//c=c+20;a
		System.out.println(" the value of a is"+a);
		System.out.println(" this is father interface menthod implement in daugher class");
	}

	@Override
	public void money() {
		System.out.println(" this is father interface menthod implement in daugher class");
		
	}

	@Override
	public void happiness() {
		System.out.println(" this is mother interface menthod implement in daugher class");
		
	}

	@Override
	public void kindness() {
		
		System.out.println(" this is mother interface menthod implement in daugher class");
		
	}

	@Override
	public void city() {
		
		Father_Interface.super.city();
		Mother_Interface.super.city();
		Father_Interface.properties();
		Mother_Interface.properties();
	}

}
