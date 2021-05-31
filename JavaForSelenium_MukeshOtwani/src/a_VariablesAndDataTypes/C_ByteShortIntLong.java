package a_VariablesAndDataTypes;

public class C_ByteShortIntLong {

	public static void main(String[] args) {
		byte a=10;
		short b=123;
		int c=47382748;
		long d=789778979;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}                         
//If long can store such big range of numbers, then we can store everything in long itself. But, why we shouldn't?
//Cz if we are using less memory by giving a small range of numbers, then the remaining memory out of 8 Bytes is wasted.
//So, it's advisable to use int in Sel for general purpose.