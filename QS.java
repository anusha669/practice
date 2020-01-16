import java.util.Scanner;
import java.util.Random;
class QS
{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Random r=new Random();
	Qui q=new Qui();
	int a[]=new int[1000];
	System.out.println("enter array");
	for(int i=0;i<n;i++)
	{		
		a[i]=r.nextInt(1000);
	}
	long st=System.currentTimeMillis();
	q.sort(a,0,n-1);
	long et=System.currentTimeMillis();
	System.out.println("time:"+(et-st));
	System.out.println("sorted array");
	for(int j=0;j<n;j++)
		System.out.print(a[j]+"\t");
}}