package q_ExceptionHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C_ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, AWTException {
		System.out.println("Start");
		Thread.sleep(2000); //Prints end after 2 seconds
		System.out.println("End");
		try {
		FileInputStream fis=new FileInputStream(" ");//file not found exception will be thrown
		}catch(Exception e) {
			System.out.println("File Not Found");
		}
		Robot a=new Robot();//AWT Exception

	}

}
