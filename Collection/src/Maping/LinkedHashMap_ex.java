package Maping;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.WeakHashMap;

public class LinkedHashMap_ex {

	public static void main(String[] args) throws InterruptedException {
		LinkedHashMap map = new LinkedHashMap();
		map.put("sathish", 1);
		map.put("ami", 3);
		map.put("jeni", 4);
		map.put("jai", 2);
		map.put("tham", 6);
		map.put("shne", 9);
		map.put("shsh", 7);
		map.put("fjfvh", 8);
		LinkedList list = new LinkedList();
		System.out.println("LinkedHashMap.................................................");
		System.out.println(map);
		list.add("a");
		list.add("c");
		list.add("k");
		list.add("b");
		list.add("z");
		System.out.println("LinkedList.................................................");
		System.out.println(list);
		HashMap hmap = new HashMap();
		hmap.put("a", 2);
		hmap.put("x", 4);
		hmap.put("d", 1);
		hmap.put("s", 9);
		hmap.put("k", 9);
		System.out.println("HashMap.................................................");
		System.out.println(hmap);
		
		//HashMap<Integer,String> m = new HashMap<>();
				IdentityHashMap<Integer,String> m = new IdentityHashMap<>();
				Integer a = new Integer(10);
				Integer b = new Integer(10);
				m.put(a, "First");
				m.put(b, "Second");
				
				System.out.println(m);

				//HashMap m = new HashMap();
				WeakHashMap wmap = new WeakHashMap();
				temp t = new temp();
			
				wmap.put(t,"element");
				System.out.println(wmap);
			//	wmap.put("elemet", null);
				t = null;		//t will be available for garbage collection
				
				//calling garbage collector
				System.gc();
				
				
			    Thread.sleep(3000);
					
				System.out.println(wmap);	
				
				
	}

}
