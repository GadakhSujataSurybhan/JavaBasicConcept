package control_statement; 
public class Switch_Month_Study {

	public static void main(String[] args) {
		String month= "April";
		
		switch (month) {
		case "jan":System.out.println("This is first month of year");
		break;
		case "Feb":System.out.println("This is second month of year");
		break;
		case "March":System.out.println("This is third month of year");
		break;
		case "April":System.out.println("This is fourth month of year");
		break;
		case "May":System.out.println("This is may month of year");
		break;
		case "Jun":System.out.println("This is jun month of year");
		break;
		case "Jully":System.out.println("This is jully month of year");
		break;
		case "Augest":System.out.println("This is augest month of year");
		break;
		case "September":System.out.println("This is september month of year");
		break;
		case "Oct":System.out.println("This is octomber month of year");
		break;
		case "Nov":System.out.println("This is november month of year");
		break;
		case "Dec":System.out.println("This is December month of year");
		break;
		default:System.out.println("Please mention valid data between jan to dec");
			break;
		}
		

	}

}
