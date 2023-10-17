package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
	
		
		Set<String> mentors =new TreeSet<String>();
		
		mentors.add("Raghu");
		mentors.add("Dilip");
		mentors.add("Jey");
		mentors.add("Ranjani");
		mentors.add("Dilip");
		
		System.out.println(mentors);
		
			
		/*
		 * for(int i=0;i<mentors.size();i++){ mentors.get(i); }
		 */
		//advanced forloop for each
		for (String name : mentors) {
			System.out.println(name);
		}
		
		List<String> mentorsName=new ArrayList<String>(mentors);
		String individualName = mentorsName.get(2);
		System.out.println(individualName);
		
	}

}
