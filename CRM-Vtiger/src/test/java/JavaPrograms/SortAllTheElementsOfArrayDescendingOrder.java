package JavaPrograms;

public class SortAllTheElementsOfArrayDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {30,20,10,40,50};
		for(int i=0; i<a.length; i++) {	
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]){		//if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
			//System.out.println(a[0]);--->1st minimum values is 10
			//System.out.println(a[1]);
			//System.out.println(a[2]);
		}
		

	}

}
