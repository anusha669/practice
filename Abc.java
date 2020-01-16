class Abc{
	static void fn(){System.out.println("Before main");
	int i=9;}
public static void main(String args[]){
	System.out.println("After ");
	Abc.fn();

}
}