import java.util.Scanner;
#n= int(input("Number:"))
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int a[6][6];
for(i=1;i<=n;i++){
 count=i;
 for(j=n;j>0;j--){ 
  a[i][j]=count;
  count=count-1;
  if(count==0)
   break;
}}
for(i=2;i<=n;i++){
 count=i-1;
 for(j=n+1;j<2*n;j++){
  a[i][j]=count;
  count=count-1;
  if(count==0)
   break:
}}