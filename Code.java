import java.util.Scanner;
class Codathon{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char alpha[] = new char[20],a;
        int num,anum=0,k=0,j=0,i;
        for(i=n-1;i>-1;i--)
        {
          a = str.charAt(i);
          if(a!=','){
          num = (int)a - 48;
          anum += num*(int)Math.pow(2,j++);
            }
          else{
            j=0;
            alpha[k++] =(char)(anum+96);
            anum = 0;
          }
        }
        alpha[k++] =(char)(anum+96);
           
       for(i=alpha.length-1;i>-1;i--)
       {
        System.out.print(alpha[i]);
       }
    }}



1001,101,01,10
ieab
