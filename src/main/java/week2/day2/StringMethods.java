package week2.day2;

public class StringMethods {

	public static void main(String[] args) {
	
		String s="Learning Java123";  //101 
		
				
		String replace = s.replace("r","#");
		System.out.println(replace);
		
		s=s.concat("4"); //102
	     System.out.println(s);
	     
	     
	     //to get the numbers from the given string
	     
	     String lead="MMM (10042)";
	     String Company = lead.replaceAll("[^0-9]", "");	  
	     System.out.println(Company);
	     
	     
	     String name="Mary Stefia";
	     String substring = name.substring(6);
	     
	     System.out.println(substring);
	     
	     String substring2 = name.substring(2, 7);
	     System.out.println(substring2);
	     
	     
	     String price="Rs.1200";	     
	     System.out.println(price+2);
	     
	     //extracting the numbers from the String	     
	     String replaceAll = price.replaceAll("\\D", "");
	     System.out.println(replaceAll);
	     
	     //To Convert String into Integer
	     int num = Integer.parseInt(replaceAll);	     
	     System.out.println(num*2);
	     
	    
	     
		
	}

}
