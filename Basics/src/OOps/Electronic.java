package OOps;

public abstract class Electronic {
	private boolean power = false;

	public void powerOn() {
		power = true;
	}

	public void powerOff() {
		power = false;
	}

	public boolean isOn() {
		return power;
	}

	public abstract void operate();

}
