package OOps;

public class Abstract_Interface_Ex {

	public static void main(String[] args) {
		Electronic e1 = new smartPhone();
		e1.powerOn();
		e1.operate();
		
		Electronic e2 = new Television("Sony");
		e2.powerOn();
		e2.operate();
		
		Electronic e3 = new Camera();
		e1.powerOn();
		e1.operate();
		
		
	}

}
