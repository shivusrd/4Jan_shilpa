package excel_utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Csv_readscanner 
{
  public static void main(String[] args) throws FileNotFoundException 
   {
	  
	  Scanner sc = new Scanner(new File("C:\\Users\\dubey\\eclipse-workspace\\Java\\doc.csv"));  
	  sc.useDelimiter(",");    
	  while (sc.hasNext())   
	  {  
	  System.out.print(sc.next());    
	  }   
	  sc.close();    
   }
}
