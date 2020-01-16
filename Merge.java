class Merge{
public static void main(String args[]){
	MS m=new MS();
Scanner sc=new Scanner(System.in);
Random r=new Random();
System.out.println("Enter the n:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
	a[i]=r.nextInt(100);
System.out.println("unsorted");
for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
int l=0,h=n-1;
m.MS(l,h,a);
System.out.println("Sort:");
for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
}}