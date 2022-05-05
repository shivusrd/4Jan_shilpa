package excel_utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Csv_reader 
{
   public static void main(String[] args) throws IOException
   {
     String line = "";  
	 String splitBy = ",";
	 
	 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dubey\\eclipse-workspace\\Java\\doc.csv"));  
	 while ((line = br.readLine()) != null)     
	{  
	String[] employee = line.split(splitBy);    
	System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");  
	}  
     br.close(); 
		
    }
}