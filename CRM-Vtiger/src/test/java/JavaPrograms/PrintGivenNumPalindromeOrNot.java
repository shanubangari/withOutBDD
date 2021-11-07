package JavaPrograms;

public class PrintGivenNumPalindromeOrNot {

	public static void main(String[] args) {
		int n=191;//343
		int rev=0;
		int temp = n;
		while(n!=0) {
			rev=rev*10+(n%10);
			n=n/10;
		}
		if(temp==rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}

}
