package JavaPrograms;

public class ReverseStringWithoutLengthandVariable {

	public static void main(String[] args) {
		String s="java";
		String rev="";
		char[] a = s.toCharArray();
		int count=0;
		for(char ch:a) {
			count++;
		}
		for(int i=count-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);//avaj

	}

}
