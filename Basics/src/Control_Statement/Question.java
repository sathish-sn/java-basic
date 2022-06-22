/**
 * 
 * @author Sathisha Narayana
 * 
 * Question -In a parking system you are charged 20rs upto 2 hour  
 * after that for every 1 hour you will be charge additional 20rs 
 * 
 */
package Control_Statement;

public class Question {
	public static void main(String[] args) {

		int b_charge = 20; //Base fare
		int hour = 3; 
		int final_charge;
		
			if(hour<2)
			{
				System.out.println("Your Parking Charge is = 20 ");
			}else {
			final_charge = (hour-1)*b_charge;
			System.out.println("Your Parking Charge is = " + final_charge);
			System.out.print("***************************88***");
			}
			
	

}
}
