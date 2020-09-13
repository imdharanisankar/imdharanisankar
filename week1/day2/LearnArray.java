package week1.day2;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
	// [] -> Array
	String[] names = {"Balaji","Dhivya","Naveen","Sam","Bowya"};
	Arrays.sort(names);
	for(int i=0; i < names.length;i++)
	System.out.println(names[i]);
	
	String[] friendsName = new String[5];
	friendsName[0] = "Balaji";
	friendsName[1] = "Dhivya";
	
}
}
