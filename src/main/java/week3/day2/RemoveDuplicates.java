package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 4, 5, 3, 4 };

		String s="google";
		//output -->gole
		
		Set<Integer> numbers = new LinkedHashSet<Integer>();
/*
		for (Integer values : arr) {
			numbers.add(values);
		}*/

		System.out.println(numbers);
		//empty set ->to store the duplicated values
		Set<Integer> dupNumbers = new LinkedHashSet<Integer>();
		
		//to print duplicate as well the unique
		
		for(int i=0;i<arr.length;i++ ) {
			//	boolean add = numbers.add(arr[i]);
				if(!numbers.add(arr[i])) {
					dupNumbers.add(arr[i]);
				}
				
		}
		
		System.out.println("the unique Values : " +numbers);
		System.out.println("the duplicate Values : " +dupNumbers);
		
		


	}

}
