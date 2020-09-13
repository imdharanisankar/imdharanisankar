package week3.day1;

public class Car extends Vehicle{


	public void applyBrake() {
		System.out.println("normal brake");
	}
	
	public void turnAC() {
		System.out.println("AC is ON");
	}

	public void callVehicleMethod() {
		applyBrake();
		soundHorn();
	}

}
