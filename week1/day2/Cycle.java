package week1.day2;

public class Cycle {
public void printCycleName(String cycleName) {
	System.out.println("The cycle name is "+cycleName);
}
public int getCyclePrice() {
	return 5000;
}
public String getCycleColor() {
	return "Black";
}
public static void main(String[] args) {
	Cycle obj = new Cycle();
	obj.printCycleName("Hercules");
	System.out.println(obj.getCyclePrice());
	System.out.println(obj.getCycleColor());
}
}
