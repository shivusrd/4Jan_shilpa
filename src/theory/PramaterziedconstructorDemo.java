package theory;

public class PramaterziedconstructorDemo

{
	public PramaterziedconstructorDemo(String input) 
	{
		System.out.println("prameterzied " + input);
	}

	public PramaterziedconstructorDemo(int input) 
	{
		System.out.println(input + " integer type");
	}

	public PramaterziedconstructorDemo() 
	{
		System.out.println("Default construtor");
	}

	public static void main(String[] args) 
	{
		PramaterziedconstructorDemo ob = new PramaterziedconstructorDemo("shilpa");
		PramaterziedconstructorDemo ob1 = new PramaterziedconstructorDemo(20);

	}

}
