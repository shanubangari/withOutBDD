package JavaPrograms;

public class PrintFibonacciOf15 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int count=0;
		for(int i=2; i<15; i++) {
			count=a+b;
			if(count<=15) {
				//count=a+b;
				System.out.print(count+" ");
				a=b;
				b=count;
			}
		}
	}

}
