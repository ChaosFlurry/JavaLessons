package com.JohnTurkson.JavaLessons.extending;

import com.JohnTurkson.JavaLessons.implementing.Vehicle;

public class Bike implements Vehicle {
    private int capacity;
    private int onBoard;
    
    public Bike() {
        this.capacity = 1;
        this.onBoard = 1;
    }
    
    public boolean hasDriver() {
        return onBoard > 0;
    }
    
    @Override
    public void drive() {
        // ...
    }
}
