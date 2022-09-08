package exceptionInJava;

public class StrinOutOfboundException_Study {

	public static void main(String[] args) {
		String s= "sujata";
		try {
			System.out.println(s.charAt(11));
		} catch (Exception e) {
			System.out.println("please enter range between o to 5");
		}

	}

}
