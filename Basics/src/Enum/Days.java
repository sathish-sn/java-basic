package Enum;

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
