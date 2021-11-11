package JavaPrograms;

public class Summationof2NosOutputisSingleDigit {

	public static void main(String[] args) {
		int n=784;
		while(n>9) {
			int sum=0;
			int n1=n;
			while(n1>0) {
				int dig=n1%10;
				sum=sum+dig;
				n1=n1/10;


			}
			n=sum;
		}
		System.out.println(n);

	}

}
