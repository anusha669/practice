import java.util.*;
class KD{
public static void main(String[] args){
	KS k=new KS();
	System.out.println("Enter no of item:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int w[]=new int[10];
	int p[]=new int[10];
	//float x[]=new float[10];
	System.out.println("Enter weight then profit:");
	for(int i=1;i<=n;i++)
	w[i]=sc.nextInt();
	for(int i=1;i<=n;i++)
	p[i]=sc.nextInt();
	System.out.println("capacity:");
	int c=sc.nextInt();
	k.K(w,p,c,n);					//18
}}
class KS{
	void K(int[] w,int[] p,int c,int n)
	{
	int sol[][]=new int[10][10];
	System.out.println("Before LOOP");
	for(int i=0;i<=n;i++)
	{
	for(int j=0;j<=c;j++)
	{
		if(i==0||j==0)
		sol[i][j]=0;
		else if(w[i]>j)
		sol[i][j]=sol[i-1][j];
		else
		sol[i][j]=Math.max(sol[i-1][j],(sol[i-1][j-w[i]]+p[i]));
		//System.out.println("Inside LOOP");	
	}
	}
	System.out.println("profit:"+sol[n][c]);
	int i=n;int j=c;
	int sel[]=new int[n+1];
	while(i>0&&j>0)
	{
		if(sol[i][j]!=sol[i-1][j])
		{
		sel[i]=1;
		j=j-w[i];
		}
		else
		sel[i]=0;
		i--;
	}
	System.out.println("items sel:");
	for(int m=1;m<=n;m++)
	if(sel[m]==1)System.out.print(m+" ");
}}