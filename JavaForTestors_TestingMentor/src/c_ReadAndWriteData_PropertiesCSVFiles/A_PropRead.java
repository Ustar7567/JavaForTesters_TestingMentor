package c_ReadAndWriteData_PropertiesCSVFiles;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class A_PropRead { //Properties file stores the data in key-value pairs

	public static void main(String[] args) throws IOException {
		
		//Create an object of filereader class or fileinputstream.using filereader here
		//FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\JavaForTestors_TestingMentor\\src\\c_ReadAndWriteData_PropertiesCSVExcelFiles\\prop.properties");
		FileReader fr=new FileReader(System.getProperty("user.dir")+"\\src\\c_ReadAndWriteData_PropertiesCSVExcelFiles\\prop.properties");
		//Create an object for Properties class
		Properties p=new Properties();
		//Load the file
		p.load(fr);
		//Use getProperty method to get the property
		System.out.println(p.getProperty("Website")); //If we don't give the correct property key(case sensitive), it prints null.
        System.out.println(System.getProperty("user.dir"));//Returns current user directory path which we used in filereader argument
	}

}
