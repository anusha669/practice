import java.util.Scanner;
class Patt{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
char a[][];
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++)
	a[i][j]='\0';}
//int n=sc.nextInt();
	for(int i=0;i<n;i++){
	for(int j=n;j>n-i;j--)
		System.out.print("*");
	System.out.println();
	}
}
}