import java.util.Scanner;
class Dis{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
System.out.println("Sum of"+a+" "+b+"is"+(a+b));
System.out.println("Sub of"+a+" "+b+"is"+(a-b));
System.out.println("product of"+a+" "+b+"is"+(a*b));
try{
System.out.println("quot"+a/b);
}
catch(ArithmeticException e)
{
	System.out.println("divide by zero "+ e);
}
}}
		/* write code in notepad
		   save file in f:\java		in cmd prompt cd f:\java 	javac file.java(checks error)		java file  (displays output)*/
		/*char c=sc.next().charAt(0);*/