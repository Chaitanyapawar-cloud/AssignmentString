import java.util.Scanner;

public class VowelsConsonants 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String scv = str.trim().toLowerCase();
		 
		char charr[] = scv.toCharArray();
		int Vowcount=0,Concount=0;
		
		for(int i=0;i<charr.length;i++)
		{
			if(charr[i]=='a'||charr[i]=='e'||charr[i]=='i'||charr[i]=='o'||charr[i]=='u')
			{
				Vowcount++;
			}
			else
			{
				Concount ++;
			}
			
		}
		System.out.println("Vowels count is "+Vowcount+" and Consonant count is "+Concount);
		
		

	}

}
