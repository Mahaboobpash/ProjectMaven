package Generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderExcel {
public static Object[][] Getdata(String sheet)
{
Object[][] data=null;
try {
	FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheet);
	 int rc=sh.getLastRowNum();
	  Row r = sh.getRow(rc);
	short cc = r.getLastCellNum();
	data=new Object[rc+1][cc];
	
	for (int i = 0; i < rc+1; i++)
	{
	Row row = sh.getRow(i);
	for (int j = 0; j < cc; j++)
	{
	Cell cell = row.getCell(j);	
	String value = cell.getStringCellValue();
	data[i][j]=value;
	}
	}
}
catch (Exception e) 
{
	System.out.println("Invalid Path");
}
return data;
}
}
