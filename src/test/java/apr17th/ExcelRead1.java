package apr17th;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("D:\\009LiveTech\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		System.out.println("Last Row numbers "+ws.getLastRowNum());
		
		System.out.println("Physical no of Rows "+ws.getPhysicalNumberOfRows());
		
		
		System.out.println("Last Cell Number in Row 0 "+ws.getRow(0).getLastCellNum());
		
		System.out.println("Physical no of cells in Row 0 "+ws.getRow(0).getPhysicalNumberOfCells());
		
		
		
		System.out.println("End of Program..");

	}

}
