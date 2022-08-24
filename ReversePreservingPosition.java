package com.company;

import java.util.Scanner;

public class ReversePreservingPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String spt[] = str.split(" ");
		String Revstr="";
		
		for(int i=0;i<spt.length;i++)
		{
			for(int j=spt[i].length()-1;j>=0;j--)
			{
				Revstr = Revstr + spt[i].charAt(j) ;
			}
			Revstr=Revstr.to + " ";
		}
		System.out.println(Revstr);
		
	}

}
