package theory;


abstract class Cardemo
{
	public int wheel()
	{
		return 4;
	}
	abstract public String colour();
	abstract public int price();
	abstract public int seat();
}
class Huyndai extends Cardemo
{
	@Override
	public String colour() {
		return "Red";
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	@Override
	public int seat() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}

class Maruti extends Cardemo
{

	@Override
	public String colour() {
		// TODO Auto-generated method stub
		return "white";
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public int seat() {
		// TODO Auto-generated method stub
		return 5;
	}
}
public class Abstractdemooo
{
	public static void main(String[] args) {
		Maruti ob = new Maruti();
		System.out.println("wheel "+ob.wheel());
		System.out.println("seat "+ob.seat());
		System.out.println("colour "+ob.colour());
		System.out.println("price "+ob.price());
	}
}