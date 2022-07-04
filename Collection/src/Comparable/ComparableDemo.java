package Comparable;

import java.util.TreeMap;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		//TreeSet<Integer> data = new TreeSet<Integer>();
		
				TreeSet data = new TreeSet(new MyComparator());
				data.add(152);
				data.add(185);
				data.add(254);
				data.add(10);
				data.add(132);
				data.add(10);
				
			
				System.out.println(data);
				TreeSet data1 = data;
				System.out.println(data1);
				data.add(500);
				System.out.println(data);
//				MyComparator data1=new MyComparator(data , data);
				//TreeSet data1 = new TreeSet(data.comparator());
				//System.out.println(data1.comparator());
				
	}

}
