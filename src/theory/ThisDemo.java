package theory;

public class ThisDemo 
 {  
	int a;
   public ThisDemo(int a)
    {
	   this.a=20;
	   a=30;
	   System.out.println(a);
    }

   public void A()
    {
	  System.out.println(a);
    }

   public static void main(String[] args) 
    {
	  ThisDemo ob = new ThisDemo(12);
	  ob.A();
    }

}
