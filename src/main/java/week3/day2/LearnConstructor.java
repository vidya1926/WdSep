package week3.day2;

public class LearnConstructor {

	int empId; // instance variable /global variable
	String empName;
	boolean empStatus;
	static String companyName;
	// char logo;

	public LearnConstructor() {
		System.out.println("From the deafult constructor");
	}

	public static void callingStaticMethod() {
		System.out.println("From static method");
	}

	public LearnConstructor(int empId, String empName, boolean empStatus, String companyName) {
		this(); // -->LearnConstructor.LearnConstructor();
		this.empId = empId;
		this.empName = empName;
		this.empStatus = empStatus;
		this.companyName = companyName;

		System.out.println("From the parametrized constructor");
	}

	public void printValues() {
		System.out.println(empId + ":" + empName + ": " + empStatus + ":" + companyName);
	}

	public void callPrntValues() {
		this.printValues();
	}

	public static void main(String[] args) {

		/*
		 * LearnConstructor lnc=new LearnConstructor(); lnc.printValues();
		 */

		callingStaticMethod();

		LearnConstructor ln = new LearnConstructor(11, "Charmila", true, "TCS");
		ln.callPrntValues();

		LearnConstructor ln2 = new LearnConstructor(12, "Aruna", true, "Wipro");
		ln2.callPrntValues();
		ln.callPrntValues();

		LearnConstructor ln3 = new LearnConstructor(13, "Rajput", true, "TATA");
		ln2.callPrntValues();
		ln.callPrntValues();
		ln3.callPrntValues();

	}

}
