package theory;

class VijayDemo
{
	public void getdata()
	{
		System.out.println("hello getdata from Vijay demo");
	}
}
class NaveenDemo extends VijayDemo
{
	public void showdata()
	{
		System.out.println("hello showdata from naveen class");
	}
}
public class HierrarichalDemo extends VijayDemo
{

	public void hellodata()
	{
		System.out.println("hello hellodata");
	}
	
	public static void main(String[] args)
	{
		HierrarichalDemo ob = new HierrarichalDemo();
		ob.getdata();
		ob.hellodata();
		NaveenDemo ob1 = new NaveenDemo();
	    ob1.getdata();
		ob1.showdata();
	}
}