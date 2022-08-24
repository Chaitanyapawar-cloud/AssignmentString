import java.util.Scanner;

public class StringSort {
	
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a String");
	      String str = sc.next();
	      char charr[] = str.toCharArray();
	      
	      char temp;
	      for(int i=0;i<charr.length;i++)
	      {
	    	  for(int j=i+1;j<charr.length;j++) 
	    	  {
	    	  if(charr[i]>charr[j])
	    	  {
	    		  temp=charr[i];
	    		  charr[i]=charr[j];
	    		  charr[j]=temp;
	    	  }
	    	  }
	      }
	      String st=new String(charr);
	      System.out.println("\nSorted String");
	      System.out.println(st);
	      
	   }
	}


 