package week2.day4;

public class LearnStatic {

	public static String calculation="Addition"; //class variable
	public String cal="Add"; //Instance variable
	//class variable /method
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int x, int y,int z) {
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculation);
		add(3,5);
		new LearnStatic().add(3,5,6);
	}
	
	
//hirerachy -->static-->constructor-->normal
	
	

}
