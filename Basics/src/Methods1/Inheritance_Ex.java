package Methods1;

public class Inheritance_Ex {
	 
	public static void main(String[] args) {
		
		A a = new A();
		a.setValue(20);
		System.out.println(a.getValue());
		B b = new B();
		b.setValue(60);
		System.out.println(b.getValue());
		b.setName("Sathish");
		System.out.println(b.getName());
		Sub s = new Sub();
		System.out.println(s.x);
		s.increment();
		System.out.println(s.x);
		System.out.println(s.getSuper());
	}

}
