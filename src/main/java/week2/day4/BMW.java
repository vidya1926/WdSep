package week2.day4;

public class BMW extends Car{
	
	public void luxury() {
	//	super.applyBrake("Normal");
		System.out.println("High end");
	}
	
	public void applyBrake(String BrakeType) {
		//to use the overridden method from parent class
		super.applyBrake(" Normal");
		 System.out.println("Brake System :" +BrakeType);
	}

	public static void main(String[] args) {
		
		BMW ob=new BMW();
		ob.applyBrake("Disc Brake");
		ob.changeGear();
		ob.soundHorn();
		ob.luxury();
	}
	
	//BMW-->Car-->Vehicle-Multilevel inheritance
	
}
