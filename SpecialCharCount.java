import java.util.Scanner;

public class SpecialCharCount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str= sc.nextLine();
		char stra[]=str.toCharArray();
		int count=0;
		
		for(int i=0;i<stra.length;i++)
		{
			if(!Character.isDigit(stra[i]) && !Character.isLetter(stra[i]) && !Character.isWhitespace(stra[i]) )
			{
				count++;
			}
		}
		System.out.println("Special character count is "+count);
	}

}
