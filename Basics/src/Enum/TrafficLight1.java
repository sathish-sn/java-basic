package Enum;

public class TrafficLight1 {
	 private static String getNewMessage(TrafficLight t) {
		 
		 switch(t) {
		 case RED :
			 return "Stop Now";
		 case AMBER:
			 return "SLow dowm ";
		 case GREEN:
			 return "Go now";
		 default:
			 return "error";
				 
			 
			 
		 }
		 
	 }

	public static void main(String[] args) {

		System.out.println(TrafficLight.RED);
		
		//System.out.println(TrafficLight.RED instanceof Object);
		
		TrafficLight obj =  TrafficLight.RED;
		
		System.out.println(obj.getDuration());
		
		System.out.println(TrafficLight.RED.getDuration());
		TrafficLight [] arr = TrafficLight.values();
		for(TrafficLight x : arr) {
			System.out.println(x.toString() + " : "+ x.getDuration() + " :"+ getNewMessage(x));
		}
		
	}

}
