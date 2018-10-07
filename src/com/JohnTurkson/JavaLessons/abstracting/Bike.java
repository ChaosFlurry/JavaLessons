package com.JohnTurkson.JavaLessons.abstracting;

public class Bike extends Vehicle {
    public Bike() {
        this.capacity = 1;
        this.onBoard = 0;
    }
    
    public boolean canTakePassengers() {
        return false;
    }
}
