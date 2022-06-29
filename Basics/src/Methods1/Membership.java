package Methods1;

public class Membership {

	public static void main(String[] args) {
		
		GymMembership ob = new GymMembership("sathish", 8,3000);
		System.out.println(ob.toString());
		System.out.println(ob.getCost());
		Discount ob1 = new Discount("santhosh", 8,3000,.50);
		System.out.println(ob1);
		System.out.println(ob1.getDiscount());
	}

}
