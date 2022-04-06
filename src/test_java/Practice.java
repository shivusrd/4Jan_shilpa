package test_java;
class shilpa
{
	 public void getdata(String laptop) 
	  {
		System.out.println("Hello shilpa ");
	  }

}

public class Practice extends shilpa

  {
	
	public void getdata (String laptop) 
	{
	System.out.println("hello ");
	}
    
	 public static  void main(String[] args) 
	  {
		 Practice  ob = new   Practice ();
		ob.getdata(null);
	  }

	
}
