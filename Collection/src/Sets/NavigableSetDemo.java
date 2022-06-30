package Sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		//assigning treeSet object to navigableSet reference
				NavigableSet<Integer> data = new TreeSet<Integer>();
				
				//adding elements
				data.add(1000);
				data.add(3000);
				data.add(13000);
				data.add(40000);
				data.add(54000);
				System.out.println("---- Tree Set ----");
				System.out.println(data);
				System.out.println("-----------------------------------------");
				
				//Methods
				
				System.out.println("floor : "+data.floor(12999)); 
				
				System.out.println("lower : "+data.lower(1000)); 
				
				System.out.println("ceiling : "+data.ceiling(14000)); 
				
				System.out.println("higher : "+data.higher(400000)); 
				
				System.out.println("pollFirst : "+data.pollFirst()); 
				
				System.out.println("pollLast : "+data.pollLast());
				
				System.out.println("descending : "+data.descendingSet());
	}

}
