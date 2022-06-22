package Control_Statement;

public class FallthoughExample {

	public static void main(String[] args) {

		String colorcode ="y";
		switch(colorcode) 
		{
			case "O":
			case "o":
					System.out.println("Traffic light color is Orange");
					break;
			case "R":
			case "r":
					System.out.println("Traffic light color is Red");
					break;
			case "G":
			case "g":
					System.out.println("Traffic light color is Green");
					break;
			default :
					System.out.println("Inavalid colorcode");
					
		}
	}

}
