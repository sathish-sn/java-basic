package Methods1;

public class Discount extends GymMembership {
	public double discount;

	public Discount(String name, double duration, double monthlyFee, double discount) {
		super(name, duration, monthlyFee);
		  this.discount = discount;
		}
	public double getDiscount() {
		double cost = super.getCost();
		return cost * discount;
	}
	public String toString() {
		String det = super.toString()+", " + discount;
		return det;
	}

	
}
