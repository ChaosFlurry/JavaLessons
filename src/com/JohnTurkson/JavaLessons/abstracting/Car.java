package com.JohnTurkson.JavaLessons.abstracting;

public class Car extends Vehicle {
    
    // Car with default capacity
    public Car() {
        this.capacity = 5;
        this.onBoard = 0;
    }
    
    public Car(int capacity) {
        this.capacity = capacity;
        onBoard = 0;
    }
    
    public boolean canTakePassengers() {
        return true;
    }
}
