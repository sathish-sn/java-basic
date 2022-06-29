package OOps;

public class Camera extends Electronic{
	public String memoryCard = "8GB";
	public void addCard(String memoryCard) {
		this.memoryCard = memoryCard;
	}
	public boolean hasCard() {
		if(memoryCard !=null && memoryCard.trim().equals("")) {
			return true;
		}else 
			return false;
	}
	public void operate() {
		if(isOn() && hasCard()) {
			System.out.println("Click picture");
		}else if(!isOn()) {
			System.out.println("press the power button");
		}else if(!hasCard()){
				System.out.print("insert the card first");
			}
	}

	
}
