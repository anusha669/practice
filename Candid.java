/* Read input from STDIN. Print your output to STDOUT*/

import java.util.Scanner;
public class Candid{
   static int A,B,i;
   public static int find(String str,int ind)
   {
      int j;
      if(ind == 0)
         return A;
      String r_seq,l_seq;
      for(j = str.length()-1;j>ind;j--)
      {
         r_seq = str.substring(ind,j+1);
         l_seq = str.substring(0,ind);

         System.out.println(l_seq+" "+r_seq+" "+l_seq.lastIndexOf(r_seq));

         if(l_seq.lastIndexOf(r_seq) > 0)
            return (r_seq.length()*A) > B?B:(r_seq.length()*A);
      }
      return A;
   }
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      A = sc.nextInt();
      B = sc.nextInt();
      int cost = 0;
      for(i =0;i<str.length();i++)
      {
         System.out.println(cost);
         cost += find(str,i);
         
      }
      System.out.print("Cost : "+cost);
   }
}
