package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class LinkedHashSET {

	public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("enetr the String");
			String s = "((2+1)*(3+4))"; //scan.next();
			LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			PriorityQueue pq3 = new PriorityQueue();
			TreeSet ts = new TreeSet();
			SortedSet set1 = new TreeSet();
			HashSet hs = new HashSet();
			Vector v = new Vector();
			Stack sk = new Stack();
			ArrayList ar = new ArrayList();
			
			for(int i=0; i<s.length();i++) {
				char c = s.charAt(i);
				set.add(c);
				pq3.add(c);
				ts.add(c);
				set1.add(c);
				hs.add(c);
				v.add(c);
				sk.add(c);
				ar.add(c);
			}
			System.out.println("LinkedHashSet : "+set);
			System.out.println();
			System.out.println("PriorityQueue : "+ pq3);
			System.out.println();
			System.out.println("TreeSet : "+ts);
			System.out.println();
			System.out.println("SortedSet : "+set1);
			System.out.println();
			System.out.println("HashSet : "+hs);
			System.out.println();
			System.out.println("Vector : "+v);
			System.out.println();
			System.out.println("Stack : "+sk);
			System.out.println();
			System.out.println("ArrayList : "+ar);
			
			
	}

}
