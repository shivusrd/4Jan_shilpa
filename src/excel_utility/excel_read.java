package excel_utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_read
{

   public static  String readdata(String path,int colnum,int rownum)
    {
	   String value = "";
	   try 
	   {
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		XSSFSheet sheet = wb.getSheetAt(0);
	    value=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	   } catch (Exception e) 
	   {
		System.out.println("issue in readdata"+e);
	   }
	   return value;
	}	
   public static int getRowcount(String fileloc)
	{
		int rownum=0;
		try {
			FileInputStream fis=new FileInputStream(fileloc);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			rownum=sheet.getLastRowNum();
	
		} catch (Exception e)
		{
		System.out.println("Issue in GetRow count "+e);
		}
		return rownum;
	}
   
   public static void main(String[] args) 
	{
	  String path ="C:\\Users\\dubey\\eclipse-workspace\\Testingbaba_maven\\src\\main\\resources\\webtables_name.xlsx";
	  for (int i=0;i<=getRowcount(path);i++)
	  {
	   String out= readdata(path, 0, i);
	   String out1= readdata(path, 1, i);
	   System.out.println(out+"   "+out1);
	  }
    }
   
}
