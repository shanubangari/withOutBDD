package JavaPrograms;

public class SeparateCharNosSpecialChar {

	public static void main(String[] args) {
		String s="a567$C%6";
		String alfha="";
		String num="";
		String spl="";
		for(int i=0; i<s.length();i++) {
			if((s.charAt(i)>='A' && s.charAt(i)<='z') || (s.charAt(i)>='a' && s.charAt(i)<='z')) {
				alfha=alfha+s.charAt(i);
			}
			
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			
			{
			num=num+s.charAt(i);
			
			}
			else
				spl=spl+s.charAt(i);

		}
System.out.println(alfha+" "+num+" "+spl);


	}
}


