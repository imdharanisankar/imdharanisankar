package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		/**
		 * String class to create and manipulate strings.
		 * 
		 * Methods
		 * 0) toCharArray() // convert string to character
		 * 1) length // find the number of characters
		 * 2) charAt(index) // The character at the index
		 * 3) concat //Concatenate two strings only  2+"Std"
		 * 4) toString() // Convert an existing data type to String
		 * 5) subString(beginIndex, endIndex) //Extracts a particular portion of String
		 * 6) trim // Removes the white space on begining and End
		 * 7) toLowerCase, toUpperCase // to convert case
		 * 8) split('char') -- split(regex, limit) //
		 * 9) indexOf(chr) , lastIndexOf(chr) // the index of the first or last match
		 * 10)startsWith(s), endsWith(s), contains(s) // match
		 * 11)replace(oldChar, newChar), replaceAll(regex, replacement)
		 * 
		 **/






		String text1 = "Learning 123Selenium is Fun123";
		String text2 = "TestComp (10010)";

		String Input= "PayPal";
		//Fetch Each Char -> charAt or To CharArray
		// If not (Check if char is already exist inside the variable)
		//{ Assign fetched Char to new variable }

		String output ="";
		for (int i = 0; i < Input.length(); i++) {
			String temp = Character.toString(Input.charAt(i));
			if (!output.contains(temp)) {
				output = output.concat(temp);
			}
		}


		System.out.println(output);


		/*char[] allChar = text.toCharArray();

		for(int i = 0; i < allChar.length ; i++) {
			System.out.println(allChar[i]);
		}
		System.out.println(text.length());

		// text.length() -> count-1 -> index
		char lastChar = text.charAt(text.length()-1);
		System.out.println(lastChar);

//		System.out.println(text1.concat(text2));
	System.out.println(text1+text2);

		String string = Integer.toString(text2);




		System.out.println(text1.trim());

		System.out.println(text1.toUpperCase());
		System.out.println(text1.toLowerCase());

		String[] eachWord = text1.split('e');

		for(int i = 0; i < eachWord.length ; i++) {
			System.out.println(eachWord[i]);
		}

System.out.println(text1.indexOf(' '));
System.out.println(text1.lastIndexOf(' '));

		System.out.println(text1.contains(text2));

		System.out.println(text1.replace("is", text2));

		System.out.println(text1);
		System.out.println(text1.replaceAll(text2, ""));
		 */
		// \d -> only digit and  \D - Non digit
		System.out.println(text2.replace("(", ""));

	}

}
