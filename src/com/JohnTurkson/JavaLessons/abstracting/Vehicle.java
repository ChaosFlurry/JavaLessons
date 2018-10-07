package com.JohnTurkson.JavaLessons.abstracting;

public abstract class Vehicle implements Rideable {
    protected int capacity;
    protected int onBoard;
    
    public void getOn() {
        if (!isFull()) {
            onBoard++;
        }
    }
    
    public void getOff() {
        onBoard--;
        if (onBoard < 0) {
            onBoard = 0;
        }
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public boolean isFull() {
        return onBoard >= capacity;
    }
    
    public boolean hasDriver() {
        return onBoard > 0;
    }
    
    public int getPassengers() {
        if (onBoard == 0) {
            return 0;
        }
        return onBoard - 1;
    }
    
    public void drive() {
        // ...
    }
    
    public abstract boolean canTakePassengers();
}
