import java.util.Scanner;
class Codathon{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char alpha[] = new char[n+1],a;
        int num,anum,k=0,j=0;
        for(int i=n-1;i>-1;i++)
        {
          a = str.charAt(i);
          if(a!=','){
          num = (int)a - 48;
          anum = num*(int)Math.pow(2,j++);
          alpha[k++] =(char)anum;
          }
          else
            j=0;
        }
        String s = new String(alpha);
        System.out.print(s);
    }}
  /*  int T = sc.nextInt();
    while(T>0)
    {
        String a = sc.next();
        String b = sc.next();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<b.length();j++)
            {
                if(a.charAt(i)==b.charAt(j)){
               count++;
               break;}
            }
        }
    
        System.out.print("len a n b "+a.length()+""+b.length()+"count "+count);
        int c = a.length()+b.length()-2*count;
        System.out.print(c);
        T--;
    }
    
    }
}
*/
          
/*
import java.io.*;
import java.util.*;
import java.lang.*;
public class emp {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      int flag = 0;
      String str = sc.next();
      for(int i=0; str[i] !='\0' ;i++)
      {
        char ch = str[i];
      if(Character.isLowerCase(ch)) 
      {
        flag = 1;
      }}
      
      if(flag == 1)
      System.out.print("True");
      else
      System.out.print("False");    }}    
/*import java.io.*;
import java.util.*;
public class emp{
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      
      char[] ch = str.toCharArray();
      int flag = 0;
      for(int i=0;ch[i]!='\0';i++){

        System.out.println(isLowerCase(ch[i]));
}}}  */
