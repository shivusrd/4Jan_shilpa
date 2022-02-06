package theory;


	public class Final_keyword 
	{
		final int f=10;
		public void getdata()
		{
			f=10;
			System.out.println(f);
		}
		public static void main(String[] args) 
		{
			Final_keyword ob = new Final_keyword();
			ob.getdata();
		}
	}

