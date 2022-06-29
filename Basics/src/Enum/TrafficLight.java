package Enum;

public enum TrafficLight {
	
	RED(40," "), AMBER(5 ," "), GREEN(50, " ");
	
	private int duration;
	private String message;
	
	 private TrafficLight(int duration, String message){
		this.duration = duration;
		this.message = message;
		
	}
	 public int getDuration() {
		 return duration;
	 }
	String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
