package theory;

class Abcdev
{
	int b=20;
}

public class Super_Keyword extends Abcdev
{
	int b=30;
	public void getdata()
	{
		System.out.println(super.b);
	}
	public static void main(String[] args)
	{
		Super_Keyword ob  = new Super_Keyword();
		ob.getdata();
	}
}