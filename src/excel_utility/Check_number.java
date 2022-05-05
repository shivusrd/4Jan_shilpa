package excel_utility;

public class Check_number 
{
    public static void getvalidate (String input) 
    {
        
		boolean itisnumeric = true ;
		
		try 
		{
		  Double d = Double.parseDouble(input);
		} 
		catch ( NumberFormatException e) 
		{
		  itisnumeric = false ;
		}
		
		if (itisnumeric) 
		{System.out.println("your input is numeric");}
		else 
		{System.out.println("your input is not a numeric value");}
    }
	
	
	public static void main(String[] args) 
	{
		Check_number.getvalidate("44");
				
	}
}
