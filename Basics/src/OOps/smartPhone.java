package OOps;

public class smartPhone extends Electronic {
	public void operate() {
		if(isOn()) {
			System.out.println("Place a call");
		}else
		{
			System.out.println("Switch off your phone");
		}
	}

}
