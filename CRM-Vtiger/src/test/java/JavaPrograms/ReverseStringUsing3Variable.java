package JavaPrograms;

public class ReverseStringUsing3Variable {

	public static void main(String[] args) {
		System.out.println("Given String");
		String s="java";
		System.out.println(s);
		String reverse="";
		for(int i=s.length()-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Reversed string using third variable");
		System.out.print(reverse);
	}

}
