#include<stdio.h>
void main()
{
    int a[50],b[50],c=1,i,j,n;
    printf("Enter the size of array\n");
    scanf("%d",n);
    printf("Enter elements\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    i=0;
    for(j=0;j<n;j++)
    {
        b[j]=a[i];
        i++;
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(b[j]==a[i])
            {
                c++;
            }
        }
        printf("%d repeats %d times\n",a[i],c);
        c=1;
    }
}
