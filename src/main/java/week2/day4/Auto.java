package week2.day4;

public class Auto extends Vehicle{

	public void noOfWheels() {
		System.out.println("3");
	}
	
	
	public static void main(String[] args) {
		
		Auto au=new Auto();
		au.applyBrake("Disc");
		au.soundHorn();
		au.noOfWheels();
	}
//can we extend more than 1 class? or just one?-Multiple Inheritance
//not possible in java at class level
}
