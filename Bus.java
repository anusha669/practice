import java.util.Scanner;
class Bus{
    public static void main(String args[]) {
        int S[][] = new int[19][7];
        int num = 1;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=18;i++)
        {
            if(i%2!=0)
            for(int j=1;j<=6;j++)
            S[i][j] = num++;
            else
            for(int j=6;j>=1;j--)
            S[i][j] = num++;
        }
        int seat_num = sc.nextInt();
        for(int i=1;i<=18;i++)
        {
           for(int j=1;j<=6;j++)
           if(seat_num == S[i][j]){
               // Bus.opp_seat(seat_num,i,j,S);
               if(seat_num%2==0)
                   System.out.println(S[i-1][j]);
               else
               System.out.println(S[i+1][j]);
               
           }
        }
    }
 
}