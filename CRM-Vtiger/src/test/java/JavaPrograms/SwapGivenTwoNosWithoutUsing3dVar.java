package JavaPrograms;

public class SwapGivenTwoNosWithoutUsing3dVar {

	public static void main(String[] args) {
		System.out.println("Given numbers");
		int a=10;
		int b=20;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		//Swap the Given Two Nos Without Using 3rd Variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping numbers");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
