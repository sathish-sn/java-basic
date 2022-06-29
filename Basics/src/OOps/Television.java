package OOps;

public class Television extends Electronic{
	private String channel;

	public Television(String channel) {
		super();
		this.channel = channel;
		
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel() {
		return this.channel;
	}
	public void operate() {
		if(isOn() && this.channel != null) {
			System.out.println("Playing;" + channel);
		}else if(!isOn()) {
			System.out.println("switch on the tv");
		}else if(channel == null){
				System.out.println("select the channel to play");
			}
	}

}
