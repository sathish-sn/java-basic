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
	public enum Days {
		SUN("weekend"), 
		MON("weekday"),
		TUE("weekday"),
		WED("weekday"),
		THU("weekday"),
		FRI("weekend"),
		SAT("weekend");
		private String message;
		 Days(String message){
			 this.message = message;
			 
		 }
		 public String getMessage() {
			 return message;
		 }
	}


	public static void main(String[] args) {
		//Days d1 = Days.valueOf("SUN");
		//System.out.println(d1);
		//System.out.println(Days.values(args[0]));
		Days[] day = Days.values();
		for(Days d : day) {
			System.out.println(d.name()+ ":"+ getNewMessage(d));
		}
		
	}

}
