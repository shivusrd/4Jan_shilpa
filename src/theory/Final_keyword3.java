package theory;
final class Demooo
{
	final public void getdata1()
	{
		int a=30;
		System.out.println(a);
	}
}
public class Final_keyword3 extends Demooo
{
	 public void getdata()
	{
		int a=30;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Final_keyword3 ob = new Final_keyword3();
		ob.getdata();
	}
}