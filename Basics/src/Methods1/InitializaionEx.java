package Methods1;

public class InitializaionEx {
	public int x = 1;
	public static int y = 0;
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public static int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public static void setY(int y) {
		InitializaionEx.y = y;
	}
	public InitializaionEx() {
		System.out.println("No-arg constructor");
	}
	public InitializaionEx(int x) {
		System.out.println("paramitarized constructor");
	}
//	static {
//		System.out.println("1st static initializaion block");
//	}
//	{
//		System.out.println("1st instance initializaion block");
//	}
//	static {
//		System.out.println("2nd static initializaion block");
//	}
//	{
//		System.out.println("2nd instance initializaion block");
//	}


	public static void main(String[] args) {
		InitializaionEx obj = new InitializaionEx();
		//System.out.println(obj.x);
		//InitializaionEx obj1 = new InitializaionEx(5);
		System.out.println(obj.getX());
		obj.setX(200);
		obj.setY(500);
		System.out.println(obj.getX());
		System.out.println(obj.getY());
		
	}

}
