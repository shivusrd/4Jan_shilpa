package theory;

   class Dummydemo
	{
		private void showdata()
		{
			System.out.println("Hello showdata ");
		}
		public void getdata()
		{
			System.out.println("Hello getdata");
		}
	}

	public class Accessmodifiers_demo
	{

		public static void main(String[] args)
		{
			Dummydemo ob = new Dummydemo();
			ob.getdata();
			//ob.showdata();
		}
	}

