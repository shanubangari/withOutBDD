package JavaPrograms;

public class ReverseStringWrtWord {

	public static void main(String[] args) {
		String s="Welcom to tyss rmg";
		String[] str = s.split(" ");
		for(int i=str.length-1; i>=0; i--)
		{
			System.out.print(str[i]+" ");
		}

	}

}
