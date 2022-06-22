package Control_Statement;

public class Interview_Question {

	public static void main(String[] args) {

		int b_charge = 20;
		int hour = 3;
		int final_charge;
		
			if(hour<2)
			{
				System.out.println("Your Parking Charge is = 20 ");
			}else {
			final_charge = (hour-1)*b_charge;
			System.out.println("Your Parking Charge is = " + final_charge);
			}
	}

}
