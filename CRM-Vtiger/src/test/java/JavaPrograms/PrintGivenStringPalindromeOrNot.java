package JavaPrograms;

public class PrintGivenStringPalindromeOrNot {

	public static void main(String[] args) {


		String s1="";
		String s2 = "";

		s1 = "madam";
		int n = s1.length();
		for(int i = n - 1; i >= 0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		if(s1.equalsIgnoreCase(s2))

			System.out.println("The string is palindrome.");

		else

			System.out.println("The string is not palindrome.");

	}
}
