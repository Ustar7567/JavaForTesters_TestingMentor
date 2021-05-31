package m_WrapperClass;

public class C_BoxingUnboxing {

	public static void main(String[] args) {
		//Autoboxing
		int a=30;
		Integer b=a;
		System.out.println(b);
		
		//Boxing
		int a1=40;
		Integer b1=Integer.valueOf(a1);
		System.out.println(b1);
		
		//Unboxing
		Integer res=50;
		int intRes=res.intValue();
		System.out.println(intRes);
		
		//AutoUnboxing
		Integer res1=60;
		int intRes1=res1;
		System.out.println(intRes1);

	}
//Debug the code to get clear idea
}
