package ReadAndWriteData_ExcelFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A_Write {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook(); //Creates workbook
		XSSFSheet sheet1= workbook.createSheet("Sheet1");
		Row r0=sheet1.createRow(0);
		Cell c0=r0.createCell(0);
		c0.setCellValue("Manju");
		File f=new File("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\JavaForTestors_TestingMentor\\src\\ReadAndWriteData_ExcelFile\\Sample.xls");
		FileOutputStream fos= new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		workbook.close();
		
		System.out.println("File is written!");
		
		
		
		

	}

}
