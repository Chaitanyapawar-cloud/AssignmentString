import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String str1= sc.next();
		String str2= sc.next();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length()==str2.length())
		{
		
		char starr1[]=str1.toCharArray();
		char starr2[]=str2.toCharArray();
		
		Arrays.sort(starr1);
		Arrays.sort(starr2);
		
		boolean res = Arrays.equals(starr1, starr2);
		 
		if(res)
		{
			System.out.println(str1 +" and "+str2+" are anagrams");
		}
		else
		{
			System.out.println(str1 +" and "+str2+" are not anagrams");
		}
		}
		else
		{
			System.out.println(str1 +" and "+str2+" are not anagrams");
		}
		
		
		
	}

}
