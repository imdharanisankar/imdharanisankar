package week1.day2;

public class LearnConditions2 {
public static void main(String[] args) {
	int salary = 17000, bankBalance = 1000000;
	String car = "Nano";
	if(salary >= 70000) {
		System.out.println("He is qualified");
	}
	else if(car=="Duster"){
		System.out.println("He is qualified");
	}
	else if(bankBalance >= 5000000) {
		System.out.println("He is qualified");
	}
	else {
		System.out.println("Die or not qualified");
	}
}
}
