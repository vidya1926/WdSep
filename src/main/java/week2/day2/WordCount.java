package week2.day2;

public class WordCount {

	public static void main(String[] args) {
		
		String sentence="Learning String in Java123";
		
		System.out.println(sentence.length());
		
		//to break the string into words
		
		String[] split = sentence.split("r"); //delimiter ->space
		System.out.println(split.length);
		
		for(int i=0;i<=split.length-1;i++)
		{
		System.out.println(split[i]);
		
		}
		
		
		
		
		//Learning
		//String
		//in
		//Java123
		
		
		
		
	}

}
