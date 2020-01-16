class F{
	//int fact=1;
	int Fac(int n){
	if(n==0||n==1)
	return 1;
	n=n*Fac(n-1);
	return n;
}
}

class Disp
{
public static void main(String []args)
{
F f=new F();
System.out.println(f.Fac(5));
}
}