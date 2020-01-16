#include<stdio.h>
#include<math.h>
int main(int argc, char *a[])
{
	int T,j,c,i=2;
	double N;
	scanf("%d",&T);
	for(j=T;j>0;T--)
	{
		scanf("%lf",&N);
		c = 0;
		if(N>7)
		{
			for(i=2;i<N;i++){	
			if(pow(i,3)>N)
			break;
			printf("%d",pow(i,3));
			c += N/pow(i,3);
			i++;
		}}
		printf("%d\n",c);
	}
	return 0;
}

/*
void main()
{
    char s1[20],s2[10],ch1,ch2;
        int i=1;
        scanf("%s",s1);
        scanf("%s",s2);
       strcat(s1,s2);									Anusha shetty
      while(1)										    nA su ah hs te yt
      {
          ch1 = s1[i];
          ch2 = s1[--i];
          printf("%c%c ",ch1,ch2);
          i += 3;
          if(s1[i]=='\0' && s1[i-1]!='\0'){
            printf("%c",s1[i-1]);
            break;
          }
          else if(s1[i-1]=='\0')break;
      }
}*/
/* void main(){
    char a[100],b[100];
    int i,j=0,r;
    scanf("%s",a);
    for(i=strlen(a)-1;i>-1;i--)
    {
        b[j]=a[i];
        j++;
    }
    b[j]='\0';
    r = strcmp(a,b);
    if(r==0)
    {
        printf("YES");
    }
    else
        printf("NO");
}*/

