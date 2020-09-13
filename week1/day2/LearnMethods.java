package week1.day2;

public class LearnMethods {
String name = "Testleaf";
public int num = 10;

// Syntax to create a method
// Access-Modifier Return-Type methodName(args){   }
	public void printName() {
		System.out.println("My name is Balaji");	
	}
	public void printMyName(String name) {
		System.out.println("My name is "+name);	
	}
	public int addTwoNumbers(int num1,int num2) {
		int sum = num1+num2;
		return sum;
	}
	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		String newName = obj.name;
		
		obj.printName();
		obj.printMyName("Nandhini");
		int result = obj.addTwoNumbers(15, 20);
		System.out.println(obj.addTwoNumbers(10, 20));
	}

}
