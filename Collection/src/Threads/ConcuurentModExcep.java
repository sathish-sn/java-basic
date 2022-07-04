package Threads;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;


public class ConcuurentModExcep extends Thread{
	
	private static ConcurrentHashMap<Integer , String> list = new ConcurrentHashMap<Integer, String>();

	public static void main(String[] args) {
		
		ConcuurentModExcep tchild = new ConcuurentModExcep();
		Scanner scan = new Scanner(System.in);
		tchild.start();
		for(int i=0; i<5; i++) {
			System.out.println("enter "+(i+1) +" name");
			String str = scan.next();
			list.put((i+1) , str);
		}
//		list.add("John");
//		list.add("Rohn");
//		list.add("Tom");
//		list.add("Shiva");
		System.out.println(list);
		
		Iterator<java.util.Map.Entry<Integer, String>> itr = list.entrySet().iterator();
		
		
		while(itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			System.out.println("key = "+ ((java.util.Map.Entry<Integer, String>) entry).getKey() +"Value="+ ((java.util.Map.Entry<Integer, String>) entry).getValue());
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0; i<5; i++) {
			System.out.println("child tread");
			list.put(5 ,"sathish");
		}
		
		
	}

}
