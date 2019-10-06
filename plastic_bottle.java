import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
   int t = sc.nextInt();
   long n,k,cb,q;
    while(t>0)
    {
        n = sc.nextLong();
        k = sc.nextLong();
        cb=0;
       while(n>=k)
       {
           q = n/k;
           n = n%k + q;
           cb += q;
       }
        System.out.println(cb);
        t--;
    }
    }
}
