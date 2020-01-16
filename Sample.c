#include<stdio.h>
void main(){
    int n1,n2,rev=0,rem;
    scanf("%d%d",&n1,&n2);
    while(n2)
    {
        rem = n2%10;
        n2=n2/10;
        rev = rev*10 + rem;
    }
    printf("%d %d",n2,rev);
}
