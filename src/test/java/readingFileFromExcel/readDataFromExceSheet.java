package readingFileFromExcel;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;

public class readDataFromExceSheet {
	@Test
	public void s1() throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\TrainingWorkplace\\TestingShashtraTestNG\\TestData\\Free_Test_Data_300KB_XLSX.xlsx");
		XSSFWorkbook work=new XSSFWorkbook(file);
		XSSFSheet sheet=work.getSheetAt(0);
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total no.of Rows : "+ totalRows);
		System.out.println("Total no.of Cells : "+ totalCells);
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			
			
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell currentCell=currentRow.getCell(c);
				if(currentCell == null)
				{
					continue;
				}
				
				switch(currentCell.getCellType())
				{
				case STRING:
					System.out.print(currentCell.getStringCellValue());
					break;
				
				case NUMERIC:
					System.out.print(currentCell.getNumericCellValue()); 
					break;
				case BOOLEAN:
					System.out.print(currentCell.getBooleanCellValue()); 
					break;

				}
			}
			System.out.println("| ");
		}
		work.close();
		file.close();
		
				
	}

}
