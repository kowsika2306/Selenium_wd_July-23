package week1.day2;

public class LearnSwitch {

	public static void main(String[] args) {

		String day = "Saturday";

		switch (day) {

		case "Monday":
			System.out.println("Not the day of week off");
		    break; //jump statement -->to stop the execution
		case "Tuesday": 
			System.out.println("Its a working day");
			 break;
		case "Wednesday":
			System.out.println("Its a working day");
			 break;
		case "Friday":
			System.out.println("Its my week off");
			 break;
		case "Thursday":
			System.out.println("Its not the right day");
			 break;
		default:
			System.out.println("No weekoff this week");
		}
		
	}

		}

	


