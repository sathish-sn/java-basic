package Generics;

public class LinkedListDemo {

	public static void main(String[] args) {
		DataNode<Integer> d1 = new DataNode<Integer>(20,null);
		DataNode<Integer> d2 = new DataNode<Integer>(22,d1);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}

}
