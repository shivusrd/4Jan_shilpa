package theory;

public class Static_blockdemo 
{

    public Static_blockdemo()
	{
		System.out.println("hello constructor ");
	}
	public void getdata()
	{
		System.out.println("Hello getdata");
	}
	static
	{
		int a=20;
		System.out.println("Hello static block "+a);
	}
	public static void main(String[] args)
	{
		Static_blockdemo ob = new Static_blockdemo();
		ob.getdata();
	}
}
