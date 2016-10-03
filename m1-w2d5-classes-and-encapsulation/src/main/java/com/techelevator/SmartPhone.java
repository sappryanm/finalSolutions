package com.techelevator;

public class SmartPhone {

	private String phoneNumber;
    private String carrier;
    private String operatingSystem;
    private boolean isOnCall;
    private int batteryCharge = 100;

    public SmartPhone(String phoneNumber, String carrier) {
        this.phoneNumber = phoneNumber;
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;            
    }

    public String getCarrier() {
        return carrier;            
    }

    public String getOperatingSystem() {
        return operatingSystem; 
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;            
    }

    public int getBatteryCharge() {
        return batteryCharge;            
    }

    public boolean isOnCall() {
        return isOnCall;            
    }

    public boolean call(String phoneNumberToCall, int numberOfMinutesToTalk) {
        if (phoneNumberToCall.length() != 10) {
            return false;
        }
        if (batteryCharge - numberOfMinutesToTalk <= 0) {
            return false;
        }
        isOnCall = true;
        batteryCharge -= numberOfMinutesToTalk;
        return true;
    }

    public void answerPhone() {
        isOnCall = true;
    }

    public void hangUp() {
        isOnCall = false;
    }

    public void rechargeBattery() {
        batteryCharge = 100;
    }

}
