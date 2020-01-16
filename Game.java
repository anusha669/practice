import java.util.*
class Game{
public static void main(String args[])
{
	Random r=new Random();
SCanner sc=new Scanner(System.in);
	String nam=r.next();
	for(int i=0;nam[i]!='\0';i++)
	{
System.out.println("Enter a letter");
char ch=sc.next().charAt(0);
		if(ch==nam[i])
		{
		System.out.print(nam[i]);
		}
	}
}