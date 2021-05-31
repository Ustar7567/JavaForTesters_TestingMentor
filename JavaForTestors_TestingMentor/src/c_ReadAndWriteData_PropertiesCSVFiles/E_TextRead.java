package c_ReadAndWriteData_PropertiesCSVFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E_TextRead {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\JavaForTestors_TestingMentor\\src\\c_ReadAndWriteData_PropertiesCSVExcelFiles\\textfile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(br.readLine()); //returns null cz the file has only one line and the next line has nothing to print
		
	}

}
