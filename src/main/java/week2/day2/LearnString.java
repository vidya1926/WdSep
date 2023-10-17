package week2.day2;

public class LearnString {

	public static void main(String[] args) {
	
		//most used 
		String name="Testleaf"; //literal way
		String nam="Testleaf";
		
		String comName=new String("Testleaf"); //Using object
		String comp=new String("Testleaf");
		
		
		//to compare the memory address
		
		if(comName==comp) {
			System.out.println("The values are same");
		}
		else {
			System.out.println("The values are not same");
		}
		
		
		if(name==nam) {
			System.out.println("The values are same");
		}
		else {
			System.out.println("The values are not same");
		}
		
		
		//to compare the values in the String
		if(name.equals(nam)) {
			System.out.println("The Contents are same");
		}
		else {
			System.out.println("The Contents are not same");
		}
		
		//compare the value and ignore the cases
		if(name.equalsIgnoreCase("testleaf")) {
			System.out.println("The values are same");
		}
		else {
			System.out.println("The values are not same");
		}
		
		

	}

}
