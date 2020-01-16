interface Item
{
final float pi=3.14;
float area(float r);
}
class A implements Item
{
float area(float r)
{
	return pi*r*r;
}}
public class B extends A{
public static void main(String args[]){
	System.out.println("Area="+area(10.0));
}}