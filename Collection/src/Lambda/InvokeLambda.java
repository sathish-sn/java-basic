package Lambda;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Collections;
import java.util.List;

import Comparable.MyComparator;

import java.security.*;
public class InvokeLambda {
	private int sum=0;
	public static void printF() {
		System.out.println("shdjsjskhj");
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		SecureRandom random = new SecureRandom();
		for(int i=0; i<10; i++) {
			int num1 = random.nextInt(10)+1;
			list.add(num1);
		}
		System.out.println(list);
		//int sum=0;
		
		FunInterface lam = ()->{
			int sum=0;
			for(int i=0; i<list.size();i++) {
				sum = sum+list.get(i);
			}
			System.out.println("sum = "+ sum);
		};
		lam.funmethod();
		
		//printF();
	}

}
interface FunInterface{
	public void funmethod();
}

