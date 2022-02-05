package theory;

interface RBI
{
	public int ROI();
	public int Exciseduty();
	public int getdata();
	
}
interface Rjademo
{
	public void showdata();
}
public class Interface_demo implements RBI,Rjademo
{
	@Override
	public int ROI() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int Exciseduty() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int getdata() {
		// TODO Auto-generated method stub
		return 12;
	}

	public static void main(String[] args) 
	{
		Interface_demo ob = new Interface_demo();
		System.out.println(ob.Exciseduty());
		System.out.println(ob.ROI());
		System.out.println(ob.getdata());
	}

	@Override
	public void showdata() {
		// TODO Auto-generated method stub
		
	}
}
