#include<stdio.h>
#include<string.h>
void main()
{
    char s[560];
    int i;
    printf("enter the string\n");
    gets(s);
    for(i=0;s[i]!='\0';i++);
    printf("%d",i);
}
