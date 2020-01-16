class MS{
void MS(int l,int h,int a[]){
int mid;
if(l<h)
{
mid=(l+h)/2;
MS(l,mid,a);
MS(mid+1,h,a);
mere(l,mid,h,a);
}}
void mere(int low,int mid,int high,int a[])
{
int h,k,j;
int b[]=new int[100];
h=low;
k=low,j=mid+1;
while((h<=mid)&&(j<=high))
{
if(a[h]<a[j])
{
b[k]=a[h];
h=h+1;
}
else
{
b[k]=a[j];
j=j+1;
}
k++;
}
if(j>high)
{
for(int i=h;i<=mid;i++)
{
b[k]=a[i];
k++;
}}
else
{
for(int i=j;i<=high;i++)
{
b[k]=a[i];
k++;
}
}
for(int i=low;i<=high;i++)
{
a[i]=b[i];
}}
