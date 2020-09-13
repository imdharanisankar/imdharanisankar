package week1.day2;

public class LearnConditions3 {
public static void main(String[] args) {
	String level = "Third Class";
	
	switch (level) {
	case "Balcony":
		System.out.println("The ticket cost is 300");
		break;
	case "First Class":
		System.out.println("The ticket cost is 200");
		break;
	case "Second Class":
		System.out.println("The ticket cost is 150");
		break;
	default:
		System.out.println("Please select a valid class");
		break;
	}
}
}
