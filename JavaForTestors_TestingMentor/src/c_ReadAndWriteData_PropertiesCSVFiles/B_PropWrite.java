package c_ReadAndWriteData_PropertiesCSVFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class B_PropWrite {

	public static void main(String[] args) throws IOException {
		//Create an object of fileWriterclass. We can use fileOutputStream as well instead of FileWriter
		FileWriter fw=new FileWriter("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\JavaForTestors_TestingMentor\\src\\c_ReadAndWriteData_PropertiesCSVExcelFiles\\prop.properties",true);
        //Create an object of Properties class
		Properties p=new Properties();
		//Write the properties using setProperty method
		p.setProperty("url", "https://www.amazon.com");
		p.store(fw, "Adding url");
	}

}
