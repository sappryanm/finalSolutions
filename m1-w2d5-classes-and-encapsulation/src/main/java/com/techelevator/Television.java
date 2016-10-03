package com.techelevator;

public class Television {

	private boolean isOn;
    private int selectedChannel = 3;
    private int currentVolume;

    public boolean isOn() {
        return isOn;        
    }

    public int getSelectedChannel() {
        return selectedChannel;            
    }

    public int getCurrentVolume() {
        return currentVolume;            
    }

    public void turnOn() {
        isOn = true;            
        currentVolume = 2;
    }

    public void turnOff(){
        isOn = false;
    }

    public void ChangeChannel(int newChannel) {
        if (isOn && newChannel > 3 && newChannel < 18) {
            selectedChannel = newChannel;
        }
    }

    public void raiseVolume() {
        if(isOn && currentVolume < 10) {
            currentVolume++;
        }
    }

    public void lowerVolume() {
        if (isOn && currentVolume > 0) {
            currentVolume--;
        }
    }

}
