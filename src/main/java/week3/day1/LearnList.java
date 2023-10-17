package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//Empty list
		List<String> mentors =new ArrayList<String>();
		
		System.out.println(mentors);
		//add data into the list
		
		mentors.add("Raghu");
		mentors.add("Vinoth");
		mentors.add("Dilip");
		mentors.add("Gokul");
		
		System.out.println(mentors);
		
		mentors.add(1,"Vidya");
		System.out.println(mentors);
		
		mentors.remove(1);
		System.out.println(mentors);
		
		
		//to get the size of the list
		
		int size = mentors.size();
		System.out.println(size);
		
		String menName = mentors.get(3);
		System.out.println(menName);
		
		//to add the current list into another list
		
		List<String> mentorsList=new ArrayList<String>(mentors);
		//mentorsList.addAll(mentors);
		System.out.println(mentorsList);
		
		mentorsList.add("Princila");
		mentorsList.add("Vidya");
		mentorsList.add("Ranjani");
		System.out.println(mentorsList);
		
		//remove common elements in the list in comparing with other list
		mentorsList.removeAll(mentors);
		System.out.println(mentors);
		System.out.println(mentorsList);
		
		boolean contains = mentorsList.contains("Raghu");
		System.out.println(contains);
		
		mentorsList.clear();
		System.out.println(mentorsList);
		
		System.out.println(mentors.isEmpty());
		
		Object[] array = mentors.toArray();
		
		System.out.println(array);
		
		
		int[] arr= {1,2,3,4,5};
		Arrays.sort(arr);
		List<Integer> numbers=new ArrayList<Integer>();
		System.out.println("Array into List " +numbers);
		for(int i=0;i<arr.length;i++) {
			numbers.add(arr[i]);
		}
		
		System.out.println(numbers);
		
		
	}

}
