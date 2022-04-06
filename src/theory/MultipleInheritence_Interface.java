package theory;
interface ABCDE
{
	public void A();
}
interface BD
{
	public void B();
}
public class MultipleInheritence_Interface implements ABCDE, BD
{
	
	public void B() {
		
		System.out.println("Hello B method");
	}
	
	public void A() {
		
		System.out.println("Hello A method");
	}
	public static void main(String[] args) {
		MultipleInheritence_Interface ob = new MultipleInheritence_Interface();
		ob.A();
		ob.B();
	}

}