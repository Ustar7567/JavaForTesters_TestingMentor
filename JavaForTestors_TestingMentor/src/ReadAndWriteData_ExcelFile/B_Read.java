package ReadAndWriteData_ExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B_Read {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f=new File("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\JavaForTestors_TestingMentor\\src\\ReadAndWriteData_ExcelFile\\Sample.xls");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet0= wb.getSheetAt(0);
		Row row0=sheet0.getRow(0);
		Cell cell0=row0.getCell(0);
		System.out.println(cell0+"\n");
		for (Row row: sheet0) {
			for(Cell cell:row) {
				switch(cell.getCellType())
				{
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:	
					System.out.println(cell.getNumericCellValue());
					break;
				default:
					break;

				}
			}
		}
		fis.close();




	}

}
