#include<stdio.h>
#define m 3
void main()
{
    int a[m],f=0,r=-1,i;
    printf("elements\n");
    for(r=0;r<m;r++)
    {
    scanf("%d",&a[r]);
    }
    r=r-1;
    while(f<r+1){printf("\n");
        f++;
        for(i=f;i<r+1;i++)
        printf("%d\t",a[i]);}
        if(f=r)printf("empty");
}
