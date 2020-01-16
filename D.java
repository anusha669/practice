import java.util.Scanner;
class Over{
void dis(double a)
{
	System.out.println("a:"+a);
}
void dis(String a)
{
System.out.println("a double :"+a);
}
}
class D
{
	public static void main(String args[]){
	Over o=new Over();
	o.dis(123);
	o.dis("Anu");
}}