import java.util.*;
public class TH{
public static void main(String[] args){
	System.out.println("Enter no. of ele to be gen.");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	First f=new First(n,"First");
	f.start();
}
}
class First extends Thread{
int n;
String name;
First(int num,String nam)
{
	n=num;
	name=nam;
}
public void run(){
Random r=new Random();
	for(int i=0;i<n;i++){
int num=r.nextInt(5);
System.out.println("Generated number is:"+num);
Thread t=new Thread(new Second(num,"SEcond"));
t.start();
Thread t3=new Thread(new Third(num,"Third"));
t3.start();
Thread.sleep(1000);
}}

}
class Second implements Runnable{
	int n;
	Second(int num,String nam){
n=num;
	System.out.println("Thread is:"+nam);
}
public void run(){
	System.out.println("sq:"+n*n);
}
}
Third implements Runnable{
	int n;
	Third(int num,String nam){
		n=num;
		System.out.println("Thread is:"+nam);
	}
	public void run(){
	System.out.println("cube:"+n*n*n);
	}
}