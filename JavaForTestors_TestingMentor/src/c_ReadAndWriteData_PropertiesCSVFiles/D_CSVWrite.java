package c_ReadAndWriteData_PropertiesCSVFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class D_CSVWrite {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\JavaForTestors_TestingMentor\\src\\c_ReadAndWriteData_PropertiesCSVExcelFiles\\textfile.csv");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0;i<=10;i++) {
			bw.write("I am a CSV file" + ","); //CSV files are comma separated
		}
		bw.close();
	}

}
