package theory;

public class DefaultconstructorDemoo 
{
	int b=30;
	// default constructor
	public DefaultconstructorDemoo()
	{
		int a=20;
		System.out.println("Default constructor "+a);
	}
	
	public void getdata()
	{
		System.out.println("getdata method "+b);
	}
	public static void main(String[] args)
	{
		DefaultconstructorDemoo ob = new DefaultconstructorDemoo();
		ob.getdata();
	}
}
