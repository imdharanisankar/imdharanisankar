package week1.day1;

public class LearnAccessModifier {

	public String text1 = "public";
	private String text2 = "private";
	String text3 = "default/package";
	
	public static void main(String[] args) {
		LearnAccessModifier object = new LearnAccessModifier();
		System.out.println(object.text1);
		System.out.println(object.text2);
		System.out.println(object.text3);
	}
}
