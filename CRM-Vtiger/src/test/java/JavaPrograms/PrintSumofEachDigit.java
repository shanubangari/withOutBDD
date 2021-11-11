package JavaPrograms;

public class PrintSumofEachDigit {

	public static void main(String[] args) {
		int n=123;
		int sum=0;
		while(n!=0) {
			int digit=n%10;//3
			sum=sum+digit;//0+3=3
			n=n/10;	//123/10=12 
		}
		System.out.println(sum);//1+2+3=6

	}

}
