import java.io.*;
import java.util.Scanner;
  
class RevString {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next(); 
        String nstr="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("Geeks");
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr;
      }
      System.out.println("Reversed word: "+ nstr);
    }
}