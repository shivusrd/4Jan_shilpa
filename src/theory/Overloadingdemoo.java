package theory;

public class Overloadingdemoo 
{
	public void trainsearch(String name)
	{
		if (name=="shalimar") 
		{
			System.out.println("shalimar train");
			
		}
		
		if (name =="shatabdi")
		
		{
			
			System.out.println("shatabdi train");
		}
	}
	public void trainsearch(long trainno)
	{
		System.out.println("shalimar");
	}
	public void trainsearch(String from, String to)
	{
		System.out.println("Shalimar");
	}
	
	public static void main(String[] args) 
	{
		Overloadingdemoo ob = new Overloadingdemoo();
		ob.trainsearch("bareilly", "delhi");
		
	}

}
