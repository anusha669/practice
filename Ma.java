interface Sta1{
	void Eraser(int pr);
}
interface Stat2{
	int pen();
}
class Box implements Sta1,Stat2
{
	public void Eraser(int p){
	System.out.println("price of eraser:"+p);
}
public int pen(){
	return 10;
}
}
class Ma{
	public static void main(String args[]){
	Sta1 s=new Box();
	s.Eraser(2);
Stat2 s2=new Box();
	System.out.print("pen:"+s2.pen());
}}