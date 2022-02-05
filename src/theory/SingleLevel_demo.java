package theory;

class ABC
{
	public void getdata()
	{
		System.out.println("Hello getdata");
	}
}
public class SingleLevel_demo extends ABC
{

	public void Showdata()
	{
		System.out.println("hello showdata");
	}
	public static void main(String[] args)
	{
		SingleLevel_demo ob = new SingleLevel_demo();
		ob.Showdata();
		ob.getdata();
	}
}