package week4.day2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		// row and Column
		//int [][]
		String txt = "Amazona India";// a -> 2, i-> 1
		//key - > value = Entry
		//key -> Integer ,value -> List or set 
		
		HashMap<Integer, List<String>> map1 = new HashMap<Integer, List<String>>();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] allChar = txt.toCharArray();
		for (char eachChar : allChar) {
			if (map.containsKey(eachChar)) {
				//find value of key -> if = false
				Integer value = map.get(eachChar);
				map.put(eachChar,value+1);// Update the value
			} else {
				map.put(eachChar, 1);// new entry
			}
		}
		System.out.println(map.size());
		//remove(Key)
		map.remove('i');
		
		//System.out.println(map);
		Set<Entry<Character, Integer>> allentrySet = map.entrySet();
		
		for (Entry<Character, Integer> eachEntry : allentrySet) {
//			System.out.println(eachEntry.getValue());	
			System.out.println(eachEntry.getKey()+"  ----> "+eachEntry.getValue());	
		}
		//delete all entry
		map.clear();
System.out.println(map.isEmpty());





	}

}


