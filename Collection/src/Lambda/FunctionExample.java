package Lambda;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		String str = "skadskjdsjhdjk";
		Function<String, Integer> lenF = str1->str1.length();
//		int len = callLenght(str);
		int len = lenF.apply(str);
		System.out.println(len);
	}
//
//	private static int callLenght(String str) {
//		
//		return str.length();
//	}

}
