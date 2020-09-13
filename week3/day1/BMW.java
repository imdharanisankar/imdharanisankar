package week3.day1;



public class BMW extends Car{

	public void swicthAutoPilot() {
		System.out.println("AutoPilot ON");
	}

	
	public void run() {
		soundHorn();
		applyBrake();
		super.applyBrake();
		turnAC();
	}
	// method Overriding
	public void applyBrake() {
		System.out.println("ABS Brake");
	}
	
	
	
	
}
