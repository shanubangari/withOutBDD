package JavaPrograms;

public class Swap1stLastWordGivenStringStmt {

	public static void main(String[] args) {
	String s="welcome to indai";
	String[] str = s.split(" ");
	String temp=str[0];
	str[0]=str[str.length-1];
	for(int i=0; i<str.length;i++)
	{
		System.out.print(str[i]+" ");
	}

	}

}
