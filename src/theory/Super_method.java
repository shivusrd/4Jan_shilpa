package theory;
class Pqrs
{
	public void AB() 
	{
	System.out.println("From pqrs class");
	}
}
public class Super_method extends Pqrs
{
	public void AB()
	{
		super.AB();
		System.out.println("from super method class");
	}
	public static void main(String[] args)
	{
		Super_method ob =new Super_method();
		ob.AB();
	}
}
