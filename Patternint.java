import java.util.Scanner;
class Patternint{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int a[][]=new int[5][10];
for(int i=1;i<=n;i++){
 count=i;
 for(int j=n;j>0;j--){ 
  a[i][j]=count;
  count=count-1;
  if(count==0)
   break;
}}
for(int i=2;i<=n;i++){
 count=i-1;
 for(int j=n+1;j<2*n;j++){
  a[i][j]=count;
  count=count-1;
  if(count==0)
   break;
}}
for(int i=1;i<=n;i++)
{
   for(int j=0;j<2*n;j++)
   if(a[i][j]==0)
      System.out.print("  ");
   else
   System.out.print(a[i][j]+" ");
   System.out.println();
}
}}