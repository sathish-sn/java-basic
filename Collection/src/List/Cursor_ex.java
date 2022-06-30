package List;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Cursor_ex {

	public static void main(String[] args) {
//		Vector v = new Vector();
//		Scanner scan = new Scanner(System.in);
//		for(int i=0; i<=8; i++) {
//		 Integer data = scan.nextInt();
//		 v.addElement(data);
//		}
//		System.out.println("Vector : "+v);
//		Enumeration e = v.elements();
//		while(e.hasMoreElements()) {
//			Integer element = (Integer)e.nextElement();
//			if(element % 2 == 0) {
//				System.out.println(element);
//			}
//		}
		
		ArrayList<Integer> data = new ArrayList<Integer>();		
		
		data.add(12);
		data.add(23);
		data.add(36);
		
		Iterator itr = data.iterator();
		while(itr.hasNext()) 
		{
			Integer i = (Integer)itr.next();
			if(i%3 == 0) {
				System.out.println(i);
			}else
				itr.remove();
			
		}
		System.out.println(data);
		
	}

}
