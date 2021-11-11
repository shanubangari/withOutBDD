package JavaPrograms;

public class SumOfMin1st3Nos {

	public static void main(String[] args) {
		int sum=0;
		int a[]= {30,20,10,40,50};
		for(int i=0; i<a.length; i++) {	
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]){		//if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
	}
for(int i=0; i<3; i++){	// 
sum=sum+a[i];
}
System.out.println("1st 3 min nos= "+sum);

}
}