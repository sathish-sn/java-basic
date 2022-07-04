package Generics;

public class DataNode<E> {
	private E data;
	private  DataNode<?> next;
	//private  DataNode<E> next;
	public DataNode(E data, DataNode<?> next) {
		this.data = data;
		this.next = next;
		
	}
	/**
	 * @return the data
	 */
	public E getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(E data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public  DataNode<?> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public  void setNext(DataNode<?> next) {
		next.next = next;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DataNode[ data= "+ data + " node = "+next +"]";
	}
	

}
