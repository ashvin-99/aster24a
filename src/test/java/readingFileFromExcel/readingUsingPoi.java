package readingFileFromExcel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.testng.annotations.*;
public class readingUsingPoi {
	
	@Test
	public void readFile() throws IOException
	{
		
		String filePath="D:\\Pune_Pincodes_List.xlsx";
		FileInputStream file=new FileInputStream(filePath);

		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total no.of Rows: "+ totalRows);
		System.out.println("Total no.of Cells: "+ totalCells);
		
		//---------- Total no.of Rows
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			if (currentRow == null) {
                continue; // Skip empty row
            }
			
			for(int c=0;c<=totalCells;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				String value = (cell != null) ? cell.toString().trim() : "";
                System.out.print(value + " | ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
		
	}

}
