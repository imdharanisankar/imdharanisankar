package week3.da2;

public interface RBI extends Cibil, Government{
	
	int minBalance = 500;
	
	public abstract void minimumBalance();
	public void maximumLoanAmount();

	default void sample() {
		
	}
	
}
