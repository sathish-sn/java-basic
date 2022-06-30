package QueueBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		//creating priorityQueue
				PriorityQueue pq = new PriorityQueue();
				//defaul size = 11
				//DNSO
				
				//creating priorityQueue with specified size
				PriorityQueue pq1 = new PriorityQueue(20);
				
				//creating priorityQueue with initial capacity and comparator object
				//PriorityQueue pq2 = new PriorityQueue(int initialCapacity,Comparator c);
				
				
				SortedSet s = new TreeSet();
				//creating priorityQueue equivalent to sortedSet s
				PriorityQueue pq3 = new PriorityQueue(s);
				
				List l = new ArrayList();
				//creating equivalent priorityQueue for any collection
				for(int i=1; i<=10; i++) {
					if(i%2==0) {
						l.add(i);
					}else
						l.add(0);
				}
				System.out.println(l);
				
				PriorityQueue pq4 = new PriorityQueue(l);
				//PriorityQueue pq4;
//				
//				try {
//				PriorityQueue pq4 = new PriorityQueue(l);
//				}catch(Exception e) {
//					
//				}
				pq.add(10);
				pq.add(20);
				pq.add(40);
				pq.add(5);
				pq.add(100);
				System.out.println(pq);
				System.out.println(pq4);
				
				
				
				
	}

}
