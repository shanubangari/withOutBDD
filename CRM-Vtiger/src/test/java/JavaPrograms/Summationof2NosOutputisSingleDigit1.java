package JavaPrograms;

public class Summationof2NosOutputisSingleDigit1 {

	public static void main(String[] args) { //784 7+8+4=19, 19 1+9=10, 10 1+0=1
		int n=784;							//784,78
		while(n>9) { 						//784>0= true, 78>0=true, 
			int sum=0;
			while(n>0) {					//784>0=true, 78>0, 
				int dig=n%10;				//784%10=4, 78%10=8
				sum=sum+dig;				//0+4=4, 0+8=8
				n=n/10;						//784/10=78, 78/10=7 
			}
			n=sum;							// 784=78---> n=78 78=7---> n=7
		}

		System.out.println(n);//1

	}

}
