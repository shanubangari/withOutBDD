package JavaPrograms;

public class Print1st5FibonacciNos {

	public static void main(String[] args) {
	
	int a=0;
	int b=1;
	int count=0;
	for(int i=2; i<5; i++) {
		count=a+b;
		if(count<=5) {
			//count=a+b;
			System.out.print(count+" ");
			a=b;
			b=count;
		}
	}
	}

}
