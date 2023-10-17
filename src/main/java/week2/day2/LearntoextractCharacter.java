package week2.day2;

public class LearntoextractCharacter {

	public static void main(String[] args) {
		
		String companyName="Testleaf"; //char[] ->char sequence
		//faeltseT
		//to find the number of characters in the String
		
		int length = companyName.length();
		System.out.println(length);
		
		//starting index is zero
		
		//to get the single character form the String-Returns the char value at the specified index
		char charAt = companyName.charAt(2);
		System.out.println(charAt);
		
		//Reverse the given String 
		
		//for(int i=length of string ;i>=0;i--)
		
		//Method :1
		//i=7;i>=0;i--
		for(int i=length-1;i>=0;i--) {
			System.out.print(companyName.charAt(i));
		}
		
		//Method:2
		char[] charArray = companyName.toCharArray(); 
		//{'T','e','s','t'}
		System.out.println();
		System.out.println("Method 2");
		
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		
		
		
		
		
	}

}
