import java.util.*;
public class Mergemain{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Random r=new Random();
	MergeS m=new MergeS();
	System.out.println("Enter no. of ele:");
int n=sc.nextInt();
int a[]=new int[10];

for(int i=0;i<n;i++)
	a[i]=r.nextInt(100);
for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
long st=System.nanoTime();
m.MergeSort(0,n-1,a);

long et=System.nanoTime();
System.out.println("Sorted:");
for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
System.out.print("\n");
System.out.print(et-st);
}}
class MergeS{
	void MergeSort(int low,int high,int[] a)
    {
	int mid;
	if(low<high)
	{
	mid=(low+high)/2;
	MergeSort(low,mid,a);
	MergeSort(mid+1,high,a);
	Merge(low,mid,high,a);
	}
    }
void Merge(int low,int mid,int high,int a[])
{
	int i,j,k;
	i=low;
k=low;
j=mid+1;
	int b[]=new int[10];
	while((i<=mid)&&(j<=high))
	{
		if(a[i]<a[j])
		b[k]=a[i++];
		else
		b[k]=a[j++];
	k=k+1;
	}
	if(j>high)
	for(int z=i;z<=mid;z++)
	{b[k]=a[z];
k=k+1;}
	else
	{for(int z=j;z<=high;z++){
	b[k]=a[z];
k=k+1;}}
System.out.println();
for(int z=low;z<=high;z++)
{	a[z]=b[z];
	//System.out.print(b[z]+" ");
}
}}