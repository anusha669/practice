interface ball{
	default void bowl(){
	System.out.println("I am Bowler");
}
}
interface bat
{
default void batt(){
	System.out.println("I am a Batsman");
}
}
class All implements ball,bat{
	public static void main(String args[]){
	All a=new All();
	a.batt();
	a.bowl();
	a.Allr();
}	
	void Allr(){
	System.out.println("I am a Batsman and Bowler");
}

}