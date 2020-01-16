class Ham
{
	public static void main(String args[]){
	HC h=new HC();
	h.get(1);
	if(h.sol==0)
		System.out.println("No cycle");
}
class HC{
	int a[][]=new int[10][10];
	int x[]=new int[4];
int n;
int sol=0;
	HC(){
	Scanner sc=new Scanner(System.in);
	System.out.println("No. nodes:");
	n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	a[i][j]=sc.nextInt();
	x[i]=-1;
	}
	x[0]=0;
	}
	void next(int k)
{
	int i=0;
	while(1)
	{
	x[k]=x[k]+1;
	if(k==n)
	{
	x[k]=-1;
	return;
	}
	if(a[x[k-1]][x[k]]==1)
	{
		for(i=0;i<k;i++)
			if(x[i]==x[k])
			break;
	}
	if(i==k)
	{
	if(k<n-1||k==n&&a[x[n-1]][0]==1)
	return;
	}
	}
}
	void get(int k){
	while(true)
	{
		next(k);
		if(x[k]==-1)
		return;
		if(k==n-1){
		sol+=1;							//pqr;
		for(int i=0;i<n;i++)
		System.out.print("\n"+(x[i]+1)+" ");
		}
		else 
		get(k+1);
	}
	}
}}
	