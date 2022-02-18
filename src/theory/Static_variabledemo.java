package theory;

public class Static_variabledemo {


	static int a=0;
	public Static_variabledemo() 
	{
		a++;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Static_variabledemo ob = new Static_variabledemo();
		Static_variabledemo ob1 = new Static_variabledemo();
		Static_variabledemo b2 = new Static_variabledemo();
		
	}
}
