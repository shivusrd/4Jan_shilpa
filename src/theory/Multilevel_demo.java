package theory;

class PQR
{
	
	public void a()
	{
		System.out.println("hello a method ");
	}
}
class OPQ extends PQR
{
	public void b()
	{
		System.out.println("Hello b method ");
	}
}
public class Multilevel_demo extends OPQ
{
	public void c()
	{
		System.out.println("hello c method ");
	}
public static void main(String[] args) {
	Multilevel_demo ob = new Multilevel_demo();
	ob.c();
	ob.a();
	ob.b();
}
}

