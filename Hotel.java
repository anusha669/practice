import java.util.Scanner;
class Hotel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Menu m[]=new Menu[n];		//8
		for(int j=0;j<n;j++)
		{
		m[j]=new Menu();
		m[j].t=sc.nextInt();
		m[j].p=sc.nextFloat();
		m[j].n=sc.next();
		}
		for(int i=0;i<n;i++){
		System.out.println(m[i].t+"\t"+m[i].p+"\t"+m[i].n);
		}
	}
}