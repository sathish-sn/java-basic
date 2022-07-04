package Generics;

public class DataDemo {

	public static void main(String[] args) {
		GeniricEx2 d = new GeniricEx2("sathish");
		System.out.println(d.toString());
		GeniricEx2 d1 = new GeniricEx2(100);
		System.out.println(d1.toString());
		GeniricEx2 d2 = new GeniricEx2(true);
		System.out.println(d2.toString());
		IData<String> str = new GeniricEx2<String>("Generic methods");
		System.out.println(str.getData());
	}

}
