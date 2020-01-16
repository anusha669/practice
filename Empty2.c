#include <stdio.h>
#include<stdlib.h>
int near(int nr,int diff,int ch)
{
    int p[6] = {65,71,73,79,83,89};
    int i,d=0;
    for(i=1;i<=6;i++)
    {
        d = abs(ch-p[i]);
        if(diff>d)
        {
            nr = p[i];
            diff = d;
        }
    }
    return nr;
}
int main(){
	int num,nr=67,diff,i,ch,t,l;
    char str[50];
    scanf("%d",&t);
    while(t){
    scanf("%d",&l);
    for(i=0;i<=l;i++)
    scanf("%c",&str[i]);
    str[i] = '\0';
    for(i=0;str[i]!='\0';i++)
    {
        nr = 67;
        ch = str[i];
        diff = abs(ch - nr);
        if(diff!=0)
        str[i] = near(nr,diff,ch);
        printf("%c",str[i]);
    }
    printf("%c\n",str[i]);
    t--;
    }
    return 0;
}
/*
int main(){
    char str[10];
    int ch,s=0,i;
    scanf("%s",str);
    for(i=0;str[i]!='\0';i++)
    {
        printf("%c",str[i]);
        ch = str[i]-96;
        printf("%d\n",ch);
        s += ch;
    }
    printf("%d",s);
}
*/

