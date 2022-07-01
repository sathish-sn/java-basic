package Maping;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import Comparable.MyComparator;

public class TreeMap_Ex {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		TreeMap map1= new TreeMap(new MyComparator());
		SortedMap s = new TreeMap();
		TreeMap m1 = new TreeMap(s);
		
		Map m4 = new HashMap();
		TreeMap m2 = new TreeMap(m4);
		
		map.put(23,"");
		map.put(10,"");
		map.put(10,"Basic");
		map.put(30,"elements1");
		map.put(40,"elements");
		
		System.out.println(map);
	
	}

}
