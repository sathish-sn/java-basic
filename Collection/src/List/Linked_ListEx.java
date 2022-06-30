package List;

import java.util.LinkedList;

public class Linked_ListEx {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();//non parameterized
		//LinkedList l2 =  new LinkedList(Collection c);
		l.add("john");
		l.add(10);
		l.add(null);
		//System.out.println(l);
		l.set(2, 13);
		//System.out.println(l);
		l.add(2, true);
		System.out.println(l);
		//l.remove();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst(10);
		System.out.println(l);
	}

}
