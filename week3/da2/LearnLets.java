package week3.da2;

import java.util.ArrayList;
import java.util.List;

public class LearnLets {

	public static void main(String[] args) {
	
		List<String> nameList = new ArrayList<>();
		
		
		//node |Value|Address|
		//array -> [index]
		
		nameList.add("Gopi");
		nameList.add("Babu");
		nameList.add("Mohan");
		nameList.add("Sarath");
		nameList.add("Gopi");
		
		System.out.println(nameList);
		
		System.out.println(nameList.size());
		
		System.out.println(nameList.get(2));
		
		System.out.println(nameList.remove(3));
		
		System.out.println("******************************");
		
		//for(dataType temp : collections)
		for(String eachName : nameList) {
			System.out.println(eachName);
		}
		
		/*System.out.println(nameList.contains("Sarath"));
		
		nameList.clear();
		
		System.out.println(nameList.isEmpty());
		
		System.out.println(nameList);
		*/
		
		
		
		
		
		
		
		
		
	}
	
}
