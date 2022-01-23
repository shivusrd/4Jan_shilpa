package javaprograms;

public class Calcidemo

{
	int a, b, c;

	public void add()
	{
		a = 19;
		b = 20;
		c = a + b;

		System.out.println("additon is " + c);
	}

	public void sub()
	{
		a = 40;
		b = 10;
		c = a - b;
		System.out.println("substraction is "+ c);
	}

	public void multi() 
	{
		a = 50;
		b = 10;
		c = a * b;
		System.out.println("multiplication is "+ c);
	}

	public void div() 
	{
		a = 60;
		b = 30;
		c = a / b;
		System.out.println("division is "+ c);
	}

	public static void main(String[] args)

	{
		Calcidemo ob = new Calcidemo();
		ob.div();
		ob.add();
		ob.multi();
		ob.sub();
	}

}
