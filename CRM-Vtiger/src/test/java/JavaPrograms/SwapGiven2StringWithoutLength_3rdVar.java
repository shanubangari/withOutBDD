package JavaPrograms;

public class SwapGiven2StringWithoutLength_3rdVar {

	public static void main(String[] args) {
		System.out.println("Given String");
		String s1="java";
		String s2 = "TYSS";
		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		System.out.println("Swapped String");
		System.out.println("s2= "+s2);
		s1=s1.substring(s2.length());
		System.out.println("s1= "+s1);

	}

}
