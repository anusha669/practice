import java.util.Scanner;
class Empty
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            //    1
                                                        //    3 2
        int n = sc.nextInt();                           //    4 5 6
        int num=1;
        int a[][] = new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
           for(int j=1;j<=i;j++)
           {
                a[i][j] = num++;
           }
           else
           for(int j=i;j>0;j--)
           {
                a[i][j] = num++;
           }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
                if(a[i][j]!=0)
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    } 
}