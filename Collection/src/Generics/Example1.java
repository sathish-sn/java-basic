package Generics;
import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		String[] strArray = new String[20];
		//Employee[] empArray = new Employee[20];
		strArray[0] = "sathish";
		ArrayList l = new ArrayList();
//		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
		l.add("sathish");
		l.add("santhosh");
		}
		System.out.println(l);
		System.out.println(l.size());
	}

}
