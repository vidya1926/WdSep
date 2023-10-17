package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatecharacters {

	public static void main(String[] args) {

		String s = "google";

		char[] ch = s.toCharArray();

		Set<Character> uniqueSet = new LinkedHashSet<Character>();
		Set<Character> dupSet = new LinkedHashSet<Character>();

		for (char c : ch) {
			if (!uniqueSet.add(c)) {
				dupSet.add(c);
			}
		}

		for (Character character : uniqueSet) {
			System.out.print(character);
		}
		System.out.println();
		for (Character character : dupSet) {
			System.out.print(character);
		}

	}

}
