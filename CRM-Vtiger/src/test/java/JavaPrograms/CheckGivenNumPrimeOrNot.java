package JavaPrograms;

public class CheckGivenNumPrimeOrNot {

	public static void main(String[] args) {
		int n=17;
		int i;
		if(n==1) {
			System.out.println("prime starts from 2");
		}
		for( i=2; i<n; i++) {
			if(n%i==0) {
				System.out.println("number is not a prime");
			break;
			}
		}
		if(n==i) {
			System.out.println("number is a prime");
		}
	}

}
