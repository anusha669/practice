import java.util.Scanner;
class PD{
	public static void main(String args[])
	{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int w[][]=new int[10][10];
	for(int i=1;i<=n;i++)
	for(int j=1;j<=n;j++)
	w[i][j]=sc.nextInt();
	System.out.println("source:");
	int s=sc.nextInt();
	Prim p=new Prim();
	p.P(w,n,s);
	}}
class Prim{
	void P(int[][] w,int n,int s){
	int vis[]=new int[7];
	for(int i=1;i<=n;i++)
	{vis[i]=0;}
	vis[s]=1;
	System.out.println("src"+s);					//20
	int min=999;
	int ne=0;
	int c=0;
int u=0,v=0;
	while(ne<n-1)
	{
	min=999;
	for(int i=1;i<=n;i++)
	{
		if(vis[i]==1)
		for(int j=1;j<=n;j++)
		{
			if((i!=j)&&(vis[j]==0)&&(w[i][j]<min))
			{	min=w[i][j];
			//	System.out.println("\n");
				u=i;
				v=j;
			}
		}
	}
	//System.out.println("\n");
	vis[v]=1;
	System.out.println(u+"-->"+v+":"+w[u][v]);
	ne++;						//40
	c+=w[u][v];
	}
	/*for(int i=1;i<=n;i++)
	if(vis[i]==0)
	{	System.out.println("no mst");
		break;}*/
	System.out.println("Cost="+c);
	//return;
}
}

