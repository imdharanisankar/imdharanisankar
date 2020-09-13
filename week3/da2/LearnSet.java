package week3.da2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
	
		Set<String> nameList = new LinkedHashSet<>();
		
		nameList.add("Gopi");//
		nameList.add("Babu");
		nameList.add("Mohan");
		nameList.add("Sarath");
		//by set -> nameList.add("Gopi");
		
		System.out.println(nameList);
		
		System.out.println(nameList.size());
		
		System.out.println(nameList.remove("Gopi"));
		
		System.out.println("******************************");
		
		//for(dataType temp : collections)
		for(String eachName : nameList) {
			System.out.println(eachName);
		}
		
		System.out.println(nameList.contains("Sarath"));
		
		nameList.clear();
		
		System.out.println(nameList.isEmpty());
		
		System.out.println(nameList);
		
		
		
		
		
		
		
		
		
		
	}
	
}
