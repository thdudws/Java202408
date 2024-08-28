package tv;

public class TV {

	public static final String String = null;
	private String model;
	private int size;
	private int channel;
	
	public TV() {}
	
	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public void channelUp() {
		
		int tmp =channel+1;
		if(tmp>10) {
			tmp = 1;
		}
		channel = tmp;	
	}
	
	public void channelDown() {
		
		int tmp = channel-1;
		if(tmp<1) {
			tmp = 10;
		}
		channel = tmp;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public String toString(String string) {
		return string;
	}
	
	
	
}
