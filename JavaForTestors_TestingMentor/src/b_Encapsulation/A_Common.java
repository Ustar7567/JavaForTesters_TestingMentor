package b_Encapsulation;

public class A_Common {
	private int length; //Setting the variables as private to avoid external classes accessing this data
	private int width;
	private int height;
	
	public void setBoxDimensions(int l, int b, int h) { //restricting invalid entries of dimensions in this method
		if(l>=1 && b>=1 && h>=1){
			System.out.println("Box is created with dimensions "+l+" "+b+" "+h);
		}
		else {
			System.out.println("Invalid dimensions");
		}
	}
	
	public int setLength(int l) { //Setter methods for length, width and height that restrict dimensions to be >=1
		if(l>=1) {
		length=l;
		}
		else {
			System.out.println("Give valid length");
		}
		return length;
	}
	
	public int setWidth(int b) {
		if(b>=1) {
			width=b;
			}
		else {
			System.out.println("Give valid width");

		}
		return width;
	}

	public int setHeight(int h) {
		if(h>=1) {
			height=h;
			}
		else {
			System.out.println("Give valid height");

		}
		return height;
	}
	
	public int getLength() { //Getter methods for length, width and height
		return length;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}


}
