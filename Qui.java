class Qui{
void sort(int a[],int l,int h)
{
	int j;
	if(l<h)
	{
		j=p(a,l,h);
	sort(a,l,j-1);
	sort(a,j+1,h);
	}
}
int p(int a[],int l,int h)
{
	int i,j,key,temp;
	key=a[l];
	i=l+1;
	j=h;
	for(;;)
	{
		while((key>=a[i])&&(i<=h))
			i++;
	while((key<=a[j])&&(j>=l))
		j--;
	if(i<j)
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
else
{
temp=a[j];
a[j]=key;
key=temp;
return j;
}
}
}
}
