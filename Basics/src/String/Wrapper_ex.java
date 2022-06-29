package String;

public class Wrapper_ex {

	public static void main(String[] args) {
		Byte num = new Byte((byte)127);
		System.out.println(num);
		Byte num1 = new Byte("127");
		System.out.println(num1);
		Integer i = new Integer("2000");
		int val = i;
		System.out.println(i);
		System.out.println(val);
		Boolean e = new Boolean("true");
		Boolean e1 = new Boolean("false");
		System.out.println(e1);
		
	}

}
