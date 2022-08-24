import java.util.Scanner;

public class PanagramCheck {
	
	public static boolean StrPanagram(String str)
	{
		
		int x;
		char strarr[] = str.toCharArray();
		boolean Arrbool[]= new boolean[26];
		for(int i=0;i<strarr.length;i++)
		{
			if(Character.isLetter(strarr[i]))
			{
				x = strarr[i] - 'a';
				Arrbool[x]=true;
				
			}
		}
		for(int j=0;j<26;j++)
		{
			if(!Arrbool[j])
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
        int count =0;
		
		str = str.toLowerCase();
		if(StrPanagram( str))
		{
			System.out.println(str+ " is Panagram");
		}
		else
			System.out.println(str+ " is not a Panagram");

	}

}
