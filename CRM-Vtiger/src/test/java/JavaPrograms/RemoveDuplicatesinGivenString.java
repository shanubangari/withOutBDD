package JavaPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesinGivenString {

	public static void main(String[] args) {
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		String s="killer";
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		 for(Character ch:set) {
			System.out.print(ch); 
		 }

	}

}
