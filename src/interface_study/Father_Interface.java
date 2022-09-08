package interface_study;

public interface Father_Interface {
	
	

	void attitude();
	void money();
	default void city()
	{
		System.out.println("father city");
	}
	 static void properties()
	{
		System.out.println("father property");
	}

}
