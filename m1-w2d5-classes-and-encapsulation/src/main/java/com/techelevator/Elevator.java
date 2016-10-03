package com.techelevator;

public class Elevator {
	
    private int shaftNumber;
    private int currentLevel;
    private int numberOfLevels;
    private boolean isDoorOpen;
    private boolean isMoving;

    public Elevator(int shaftNumber, int totalNumberOfFloors) {
        this.shaftNumber = shaftNumber;
        this.numberOfLevels = totalNumberOfFloors;
        this.currentLevel = 1;
    }

    public int getShaftNumber() {
        return shaftNumber;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getNumberOfLevels() {
        return numberOfLevels;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;        
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void openDoor() {
        if (!isMoving) {
            isDoorOpen = true;
        }
    }

    public void closeDoor() {
        if (!isMoving) {
            isDoorOpen = false;
        }
    }

    public boolean goUp(int desiredFloor) {
        if(!isDoorOpen && desiredFloor > currentLevel && desiredFloor <= numberOfLevels) {
            currentLevel = desiredFloor;
            return true;
        }
        return false;
    }

    public boolean goDown(int desiredFloor) {
        if (!isDoorOpen && desiredFloor < currentLevel && desiredFloor > 0) {
            currentLevel = desiredFloor;
            return true;
        }
        return false;
    }

}
