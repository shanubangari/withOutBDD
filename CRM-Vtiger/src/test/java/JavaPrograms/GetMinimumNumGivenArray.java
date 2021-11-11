package JavaPrograms;

public class GetMinimumNumGivenArray {

	public static void main(String[] args) {
		int a[]= {30,20,10,40,50};
		for(int i=0; i<a.length; i++) {	
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]){		//if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
			System.out.println("1st min values is "+a[0]);
			System.out.println("2nd min values is "+a[1]);
			System.out.println("3rd min values is "+a[2]);
			System.out.println("4th min values is "+a[3]);
			System.out.println("5th min values is "+a[4]);
			
		}
		
	}}
