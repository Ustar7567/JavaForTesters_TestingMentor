package f_StringClassinJava;

public class D_Split_Trim {

	public static void main(String[] args) {
		String str="Selenium-HP-QTP-Grid";
		String [] toolname=str.split("-");
		for(int i=0;i<toolname.length;i++) {
			System.out.println(toolname[i]);
		}
		
		String str1="     Selenium training      ";
		System.out.println(str1.length());
		String str2=str1.trim();
		System.out.println(str2);
		System.out.println(str2.length());

	}

}
