import java.util.Scanner;

public class RepeatedCharString 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str= sc.nextLine();
		char stra[]=str.toCharArray();
		System.out.println("Repeated Characters in a String are");
		int count=1;
		for(int i=0;i<stra.length;i++)
		{
			for(int j=i+1;j<stra.length;j++)
			{
				if(stra[i]==stra[j] && stra[i]!='0')
					{count++;
					stra[j]='0';
					}
				
				
			}
			if(count>1&& stra[i]!='0')
			{
				System.out.println(stra[i] +" : "+ count+"\n");
			}
			stra[i]='0';
			count=1;
			
		}
		
		

	}

}
