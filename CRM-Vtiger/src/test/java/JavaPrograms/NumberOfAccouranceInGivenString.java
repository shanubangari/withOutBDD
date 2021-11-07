package JavaPrograms;

import java.util.HashSet;

public class NumberOfAccouranceInGivenString {

	public static void main(String[] args) {
		String s="indai";
		HashSet<Character> set=new HashSet<Character>();
		for(int n=0; n<s.length(); n++) {
			set.add(s.charAt(n));
		}
		
		for(Character ch:set) {
			int count = 0;
			for(int n=0; n<s.length(); n++) {
				if(ch==s.charAt(n)){
					
					count++;
				}
			}
			//if(count>1)
			System.out.println(ch+"= "+count);
		}
		
		
	}

}
