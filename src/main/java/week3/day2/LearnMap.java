package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		
		Map<Integer,String> empDetails=new HashMap<Integer,String>();
		empDetails.put(101, "Aruna");
		empDetails.put(102,"Charmila");
		empDetails.put(103, "Revathi");
		empDetails.put(104, "Kishore");
		empDetails.put(105, "Srinivas");
		
		System.out.println(empDetails);
		
		
		Set<Entry<Integer, String>> entrySet = empDetails.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +" --> "+value);
		}
			
		
	}

}
