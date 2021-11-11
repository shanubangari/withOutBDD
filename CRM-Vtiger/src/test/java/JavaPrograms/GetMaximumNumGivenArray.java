 package JavaPrograms;

public class GetMaximumNumGivenArray {

	public static void main(String[] args) {
		int a[]= {30,20,10,40,50};
		for(int i=0; i<a.length; i++) {	
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]){		//if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
			System.out.println("1st max values is "+a[0]);
			System.out.println("2nd max values is "+a[1]);
			System.out.println("3rd max values is "+a[2]);
			System.out.println("4th max values is "+a[3]);
			System.out.println("5th max values is "+a[4]);
			
		}
		

	}

}
