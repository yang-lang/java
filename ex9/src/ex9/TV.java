package ex9;

public class TV {
		int channel1 = 1; // Default channel is 1
		int volumeLevel1 = 1; // Default volume level is 1
		boolean on = false; // TV id off
		public TV() {
		}
		
		public void turnOn() {
			on = true;
		}
		
		public void turnOff() {
			on = false;
		}
		
		public void setChannel(int newChannel) {
			if(on && newChannel >= 1 && newChannel <= 120)
				channel1 = newChannel;
		}
		
		public void setVolume(int newVolumeLevel1) {
			if(on && newVolumeLevel1 >= 1 && newVolumeLevel1 <= 7)
				volumeLevel1 = newVolumeLevel1;
		}
		
		
		public void channelUp() {
			if(on && channel1 < 120)
				channel1++;
		}
		
		public void channelDown() {
			if(on && channel1 > 1)
				channel1--;
		}
		
		public void volumeUp() {
			if(on && volumeLevel1 < 7)
				volumeLevel1++;
		}
		
		public void volumeDown() {
			if(on && volumeLevel1 > 1)
				volumeLevel1--;
		}

}