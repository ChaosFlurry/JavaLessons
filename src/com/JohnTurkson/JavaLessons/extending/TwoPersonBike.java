package com.JohnTurkson.JavaLessons.extending;

import com.JohnTurkson.JavaLessons.implementing.Rideable;
import com.JohnTurkson.JavaLessons.implementing.Vehicle;

public class TwoPersonBike implements Vehicle, Rideable {
    private int capacity;
    private int onBoard;
    
    public TwoPersonBike() {
        this.capacity = 2;
        this.onBoard = 0;
    }
    
    @Override
    public void getOn(String rider) {
        if (!isFull()) {
            capacity++;
        }
    }
    
    public void getOff(String rider) {
        capacity--;
        if (capacity < 0) {
            capacity = 0;
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
}
