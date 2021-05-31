package c_ReadAndWriteData_PropertiesCSVFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F_CSVRead {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\JavaForTestors_TestingMentor\\src\\c_ReadAndWriteData_PropertiesCSVExcelFiles\\textfile.csv");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		br.readLine();
		br.close();
			}

}
