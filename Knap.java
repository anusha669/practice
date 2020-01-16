import java.util.Scanner;
class Knap{
	public static void main(String[] args){
	KS k=new KS();
	System.out.println("Enter no of item:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	float w[]=new float[10];
	float p[]=new float[10];
	float x[]=new float[10];
	System.out.println("Enter weight then profit:");
	for(int i=0;i<n;i++)
	w[i]=sc.nextInt();
for(int i=0;i<n;i++)
	p[i]=sc.nextInt();
	System.out.println("capacity:");
	float c=sc.nextInt();
	for(int i=0;i<n;i++)
	x[i]=p[i]/w[i];
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++)
	{
	if(x[j]<x[j+1])
	{
	swap(x,j,j+1);
	swap(w,j,j+1);
	swap(p,j,j+1);
	}
	}
	k.KSS(w,p,c,n);
}
public static void swap(float[] x,int j,int i)
{
	float temp=x[j];
	x[j]=x[i];
	x[i]=temp;
}}
class KS{
	void KSS(float[] w,float p[],float c,int n)
{
float u=c;
int i;
float x[]=new float[10];
float tot=0;
for(int j=0;j<n;j++)
	x[j]=0;
for(i=0;i<n;i++)
{
	if(w[i]>u)break;
	else
	{
	x[i]=1;
	tot+=p[i];
	u=u-w[i];
	}
}
if(i<n)
x[i]=u/w[i];
tot+=x[i]*p[i];
System.out.println("cost:"+tot);
System.out.println("weight\tprofit\tfraction");
for(int j=0;j<n;j++)
	System.out.println(x[j]*w[j]+"\t"+x[j]*p[j]+"\t"+x[j]);
}}