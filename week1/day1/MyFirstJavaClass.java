package week1.day1;

public class MyFirstJavaClass {

	// To execute your program, you must have main()
	public static void main(String[] args) {
		System.out.println("Welcome to Selenium Class");
		// Syntax to create an object for the class
		// ClassName obj = new ClassName();
		MyFirstJavaClass object = new MyFirstJavaClass();
		// Syntax to call a variable from a class
		// object.variableName;
		System.out.println(object.name);
	}

	// Syntax to create a variable
	// datatype variableName = value;
	int number1 = 1234567890;
	short number2 = 12345;
	long number3 = 9876543210L;

	float number4 = 0.431F;
	double number5 = 9876.0987654321;

	char text = 'a';
	char number = '1';

	boolean result1 = true;
	boolean result2 = false;

	// Non Primitive Data type -> String
	String name = "Testleaf";

}
