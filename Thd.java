class NT implements Runnable
{
	//Thread t;
	NT(){
	Thread t=new Thread(this,"Demo");
	System.out.println("child thread"+t);
	t.start();
	}
	public void run(){
	try{
	for(int i=0;i<5;i++)
	System.out.print(i);
	Thread.sleep(1000);
	}
catch(InterruptedException e){
	System.out.print("\n interrupted");
}
}
}
class Thd{
	public static void main(String args[]){
	new NT();
}
}
