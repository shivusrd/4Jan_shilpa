package theory;

class A
{
	public void a()
	{
		System.out.println("Hello a methojd");
	}
}
class B extends A
{
	public void b()
	{
		System.out.println("Hello b method");
	}
}
class C extends A
{
	public void c()
	{
		System.out.println("hello c method ");
	}
}
public class Hybrid_demo extends C
{

	public void D()
	{
		System.out.println("Hello d method ");
	}
	
	public static void main(String[] args) {
		Hybrid_demo ob = new Hybrid_demo();
		ob.a();
		ob.c();
		C ob1= new C();
		ob1.a();
		ob1.c();
		 B ob2= new  B ();
		 ob2.a();
		 ob2.b();
		
	}
}