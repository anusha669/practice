#include<stdio.h>
#include<stdlib.h>
void main()
{
    int i,c=0;
    char a[5];
    printf("no.");
    for(i=0;i<5;i++){
    scanf("%c",&a[i]);
    }
    for(i=0;i<5;i++)
    {
        if(isdigit(a[i]))
        {
            printf("%d\t",a[i]);
            c++;
            }
        }
        printf("%d",c);}
