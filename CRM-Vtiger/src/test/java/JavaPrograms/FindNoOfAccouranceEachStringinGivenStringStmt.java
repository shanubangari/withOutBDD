package JavaPrograms;

import java.util.LinkedHashSet;

public class FindNoOfAccouranceEachStringinGivenStringStmt {
	//WAJ to print no of occurrence of each world in the given string statement
	public static void main(String[] args) {
		
		String s="Welcome to tyss";
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

			System.out.print(word+ "="+count+" ");
		}

	}

}
