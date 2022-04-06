package theory;
class Hlm
{
	public Hlm(int a, int b) 
	{
		System.out.println("Hello HLM constructor "+a+"-"+b);
	}
}
public class Super_constructor extends Hlm
{
	public Super_constructor(int a, int b)
	{
		super(a,b);
		System.out.println("Hello super constrctor ");
	}
	
	public static void main(String[] args)
	{
		Super_constructor ob = new Super_constructor(67, 90);
		
	}
}