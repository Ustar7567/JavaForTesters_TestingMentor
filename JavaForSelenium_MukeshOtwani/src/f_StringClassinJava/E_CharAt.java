package f_StringClassinJava;

public class E_CharAt {

	public static void main(String[] args) {
		String str="Bangalore";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3)+"\n");
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));//println
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));//prints all characters in same line //print
		}

	}

}
