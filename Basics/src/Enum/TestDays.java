package Enum;

public class TestDays {
	
	private static String getNewMessage(Days d) {
		switch(d) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			return "weekday";
		case SUN:
		case SAT:
			return "weekend";
			
		default:
			 return "error";
			
		}
	
	}

	public static void main(String[] args) {
		//Days d1 = Days.valueOf("SUN");
		//System.out.println(d1);
		Days[] day = Days.values();
		for(Days d : day) {
			System.out.println(d.name()+ ":"+ getNewMessage(d));
		}
		
	}

}
