package theory;
class Demooo
{
	final public void getdata ()
	{
		int a=30;
		System.out.println(a);
	}
}
public class Final_keyword2 extends Demooo
{
	// public void getdata ()
	{
		int a=30;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Final_keyword2 ob = new Final_keyword2();
		ob.getdata();
	}
}