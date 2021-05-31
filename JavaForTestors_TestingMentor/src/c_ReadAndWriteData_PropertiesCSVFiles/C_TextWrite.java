package c_ReadAndWriteData_PropertiesCSVFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C_TextWrite {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\JavaForTestors_TestingMentor\\src\\c_ReadAndWriteData_PropertiesCSVExcelFiles\\textfile.txt1");
		FileWriter fw=new FileWriter(f, true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Manjusha");
        bw.close();
	}

}
