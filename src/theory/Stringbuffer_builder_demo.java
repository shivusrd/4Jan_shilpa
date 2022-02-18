package theory;

public class Stringbuffer_builder_demo 
{
	
	public static void main(String[] args) 
	{
	
		StringBuffer sb= new StringBuffer("javademo");
		StringBuilder sd=new StringBuilder("Javademo");
		long starttime = System.currentTimeMillis();
		for(int i=0;i<=1000000;i++)
		{
			sb.append("Automation");
		}
		long endtime = System.currentTimeMillis();
		System.out.println("String buffer time taken is "+(endtime-starttime)+" ms");
		 starttime = System.currentTimeMillis();
		for(int i=0;i<=1000000;i++)
		{
			sd.append("Automation");
		}
		 endtime = System.currentTimeMillis();
		System.out.println("String builder time taken is "+(endtime-starttime)+" ms");
	}
	
}
