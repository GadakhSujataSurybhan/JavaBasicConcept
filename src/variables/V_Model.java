package variables;

public class V_Model { 
	String mod_name;
	int duration;
	String process;
	char shape;
	
	
	public static void main(String[] args) {
		
		V_Model m1= new V_Model();
		m1.v_model_deatils("Vmodel", 3, "verification and validation", 'V');
		

	}
	public void v_model_deatils(String mod_name, int duration, String process, char shape )
	{
		
		System.out.println("==========================");
		System.out.println(" the software develpoment model name is "+ mod_name);
		System.out.println(" the v model duration is "+ duration);
		System.out.println(" the v model pocess is "+ process);
		System.out.println(" the v model shape is "+shape);
		System.out.println("=================-");
	}

}
