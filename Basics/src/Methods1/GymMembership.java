package Methods1;

public class GymMembership {
	protected String name;
	protected double duration;
	protected double monthlyFee;
	 
	public GymMembership(String name, double duration, double monthlyFee) {
		this.name = name;
		this.duration = duration;
		this.monthlyFee = monthlyFee;
		
	}
	public double getCost() {
		return duration * monthlyFee;
	}
	public String toString() {
		String det = name + ", "+ duration +", "+monthlyFee;
		return det;
	}

}
