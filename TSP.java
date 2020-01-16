import java.util.*;
class TSP{
public static void main(String args[]){
	//Scanner sc=new Scanner(System.in);
Min o=new Min();
o.minc(0);
System.out.println();
System.out.println(o.cost);
}}
class Min{
	int w[][];
	int vis[];
	int n;
	Min()
	{
	Scanner sc=new Scanner(System.in);		//15
	w=new int[6][6];
	n=sc.nextInt();
	vis=new int[n];
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++)
	{	
	w[i][j]=sc.nextInt();}
	vis[i]=0;
	}
	}					//25
	public int cost=0;
	void minc(int city){
		vis[city]=1;
		System.out.print((city+1)+"-->");
		int nc=least(city);
		if(nc==999)
		{
		nc=0;
		System.out.print(1);
		cost+=w[city][nc];
			return;
		}
		minc(nc);				//38
	}
	int least(int c)
	{
		int min=999,nc=999;
		for(int i=0;i<n;i++)
		{
			if(vis[i]==0&&w[c][i]!=0)
			if(w[c][i]<min)
			{
				min=w[c][i];
				nc=i;
			}
		}
		if(nc!=999)
		{
			cost+=w[c][nc];
			//vis[nc]=1;
		}
		return nc;
	}
}							//59