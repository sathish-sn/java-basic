package Generics;

public  class GeniricEx2<T> implements IData<T>{
	private  T data;

	GeniricEx2(T data){
		this.data = data;
	}
	/**
	 * @return the data
	 */
	@Override
	public  T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	@Override
	public  void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data is " +data;
	}
	

	

}
