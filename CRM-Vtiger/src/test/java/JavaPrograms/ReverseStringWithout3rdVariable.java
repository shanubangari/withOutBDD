package JavaPrograms;

public class ReverseStringWithout3rdVariable {

	public static void main(String[] args) {
		System.out.println("Gieven string");
		String s="INDAI";
	int lengthofindex = s.length();
		for(int i=s.length()-1; i>=0; i--) {

			
			System.out.print(s.charAt(i));
		}

	}

}
