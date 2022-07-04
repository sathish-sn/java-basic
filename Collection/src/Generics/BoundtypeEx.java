package Generics;

import java.util.ArrayList;
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class BoundtypeEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] {2,3,1,5,0,4,9,6});
		ArrayList<Integer> list1 = new ArrayList<Integer>();
 		List<String> slist = Arrays.asList(new String[] {"sat","abc","zzz","cde"} );
		DataSorter<Integer> d = new DataSorter<>(list);
	//	System.out.println(list);
		DataSorter<String> d1 = new DataSorter<>(slist);
		//System.out.println(slist);
		d.getSortedData();
		d1.getSortedData();
	}

}
