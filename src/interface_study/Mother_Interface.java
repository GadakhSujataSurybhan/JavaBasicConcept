package interface_study;

public interface Mother_Interface {
	
	void happiness();
	void kindness();
	default void city()
	{
		System.out.println(" Mother city");
		
	}
	static void properties()
	{
		System.out.println("mother property");
	}

	
	

}
