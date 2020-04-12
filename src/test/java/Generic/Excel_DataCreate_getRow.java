package Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel_DataCreate_getRow {
	public static void WriteData(String sheet, int row, int cell, String val) {
		try {
			FileInputStream fis = new FileInputStream("./Excel/data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).createCell(cell);
			c.setCellValue(val);

			FileOutputStream fout = new FileOutputStream("./Excel/data.xlsx");
			wb.write(fout);
		} catch (Exception e) {

			Reporter.log("Failed to create data in Excel", true);
		}
	}
}
