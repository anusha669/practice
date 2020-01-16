#include<stdio.h>
int ptr,A,B,cost = 0;
int find(char str[],int ind)
{
    int j,start_substr,p;
    if(ind == 0)
        return A;
    for(j=0;j<ind;j++)
        if(str[j] == str[ind])
            break;
    if(j == ind)    
        return A;
    start_substr = j;
    while( j<ind && str[j++] == str[ind++]);
    j--;
    p = (j - start_substr)*A > B ? B:(j - start_substr)*A;
    return p;
}
void solve(char str[])
{
    int c;
    for(ptr = 0;str[ptr] != '\0';ptr++)
    {
        c= find(str,ptr);
        cost += c;
    }
}
int main(){
    char str[100];
    gets(str);
    scanf("%d%d",&A,&B);
    solve(str);
    printf("Minimum cost: %d",cost);
    return 0;
}
