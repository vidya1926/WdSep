package week3.day1;

import week3.day2.LearnConstructor;

public class Execution {

	public static void main(String[] args) {
		
	//	RBI rb=new RBI();
		//cannot create object for an interface
		
		RBI rb=new SBI(); //abstraction
		rb.getKYDoc();
		
		
		SBI sb=new SBI();
		
		
		RBI r=new AXIS();
		r.getKYDoc();
		r.getROI();
		r.cibilScore();
		
		AXIS a=new AXIS();
		a.festiveOffers();
		a.getKYDoc();
		a.getROI();
		a.openTerrace();
		a.builtHouse();
	  
		LearnConstructor.callingStaticMethod();
		
		//TopUpLoan ob=new TopUpLoan();
		
		
	}

}
