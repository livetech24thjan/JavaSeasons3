package apr18th;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\009LiveTech\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		//case 1 : modifying an existing cell 
		
		//ws.getRow(1).getCell(0).setCellValue("New LiveTech");
		
		//case 2: creating a cell in an existing row
		
		//ws.getRow(2).createCell(2).setCellValue("Passed");
		
		//case 3: creating a row and cell in it
		
		ws.createRow(3).createCell(0).setCellValue("appium");
		
		FileOutputStream fos=new FileOutputStream("D:\\009LiveTech\\Book1.xlsx");
		
		wb.write(fos);	
		
		wb.close();
		
		System.out.println("End of Program..");

	}

}
