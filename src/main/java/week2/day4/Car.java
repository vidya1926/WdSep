package week2.day4;

public class Car extends Vehicle {
//derived class/subclass/childclass
	//Single Inheritance
	public void changeGear() {
		System.out.println("automatic gear");
	}

	public static void main(String[] args) {

		/*
		 * Vehicle ve = new Vehicle(); ve.applyBrake(); ve.soundHorn();
		 */
				
		Car alto=new Car();
		alto.changeGear();
		alto.applyBrake("ABS");
		alto.soundHorn();
		
		
	}

}
