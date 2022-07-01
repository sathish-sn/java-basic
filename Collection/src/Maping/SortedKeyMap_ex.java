package Maping;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedKeyMap_ex {

	public static void main(String[] args) {
		
		 SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
     sm.put(new Integer(2), "practice");
     sm.put(new Integer(3), "quiz");
     sm.put(new Integer(5), "code");
     sm.put(new Integer(4), "contribute");
     sm.put(new Integer(1), "geeksforgeeks");
     Set s = sm.entrySet();
     System.out.println(sm);
       System.out.println(s);
       System.out.println(sm.size());
    // Using iterator in SortedMap
     //Iterator i = s.iterator();
       for(int i=1; i<=sm.size(); i++) {
    	   System.out.println("Key : " + sm.get(i) ); 
       }

//     // Traversing map. Note that the traversal
//     // produced sorted (by keys) output .
//     while (i.hasNext()) {
//          Map.Entry m = (Map.Entry)i.next();
//
//         int key = (Integer)m.getKey();
//         String value = (String)m.getValue();
//
//         System.out.println("Key : " + key + "  value : " + value);
//        
////     }
//     System.out.println("other methods\n");
//     System.out.println(sm.tailMap(2));
//     System.out.println(sm.headMap(2));
//     System.out.println(sm.subMap(2,5));
//     System.out.println(sm.keySet());
//     System.out.println(sm.values());
//     System.out.println(sm.entrySet());

	}

}
