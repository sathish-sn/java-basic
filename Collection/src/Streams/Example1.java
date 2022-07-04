package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(2);
		list.add(30);
		list.add(46);
		list.add(100);
		list.add(240);
		list.add(50);
		System.out.println(list);
		
		ArrayList<Integer> newlist = new ArrayList<Integer>();
		for(Integer i : list) {
			if(i>=50) {
				newlist.add(i);
			}
		}
		System.out.println(newlist);
		
		//stream
		List<Integer> l1= list.stream().filter(i->i>=30).collect(Collectors.toList());
		System.out.println(l1);
		
		List<Integer> l2= list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l2);
		
		long cnt = list.stream().filter(i->i>=30).collect(Collectors.toList());
		System.out.println(cnt);
	}

}
