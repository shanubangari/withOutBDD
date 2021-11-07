package JavaPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateWordsGivenStringStmt {

	public static void main(String[] args) {
		String s="Welcome to tyss Welcome to Bangalore";
		String[] str = s.split(" ");
		//Step1: create any set collection and add all string
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++) {
			set.add(str[i]);
		}
		for(String word:set) {
			System.out.print(word+" ");
		}

	}

}
