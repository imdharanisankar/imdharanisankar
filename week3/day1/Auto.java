package week3.day1;

public class Auto extends Vehicle{

	int numberOfWheels = 3;
	
	public void turnMeter() {
		System.out.println("Meter is On");
	}
	
	public void run() {
		applyBrake();
		soundHorn();
	}
	
	
}
