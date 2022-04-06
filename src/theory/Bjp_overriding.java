package theory;
class Congress
{
	public void calculateTax(float num)
	{
		float out=(num*5)/100;
		System.out.println(out)
;
	}
}

public class Bjp_overriding extends Congress

{public void calculateTax(float num)
{
	float out=(num*18)/100;
	System.out.println(out)
;
}
public static void main(String[] args) 
{
	Congress ob = new Congress();
	ob.calculateTax(1000);
}

}
