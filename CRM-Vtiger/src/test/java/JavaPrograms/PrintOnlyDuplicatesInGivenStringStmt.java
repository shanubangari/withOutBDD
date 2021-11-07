package JavaPrograms;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicatesInGivenStringStmt {

	public static void main(String[] args) {
		String s="welcome to tyss welcome to bangalore";
		String[] str = s.split(" ");
		//Step1: create any set collection and add all string
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++) {
			set.add(str[i]);
		}

		for(String word:set) {
			int count=0;
			for(int i=0; i<str.length; i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
if(count>1)
			System.out.print(word+ "="+count+" ");
		}

	}

}
