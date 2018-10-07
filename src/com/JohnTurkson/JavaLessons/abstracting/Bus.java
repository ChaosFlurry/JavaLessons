package com.JohnTurkson.JavaLessons.abstracting;

public class Bus extends Vehicle {
    // Assume that: a bus can have up to half the people standing and the other half sitting
    public Bus() {
        this.capacity = 40;
        this.onBoard = 0;
    }
    
    public Bus(int capacity) {
        this.capacity = capacity;
        this.onBoard = 0;
    }
    
    public boolean canTakePassengers() {
        return true;
    }
    
//    public int sitting() {
//        if (onBoard > (capacity / 2)) {
//            return capacity / 2;
//        } else {
//            return onBoard;
//        }
//    }
//
//    public int standing() {
//        if (onBoard > (capacity / 2)) {
//            return onBoard - capacity / 2;
//        } else {
//            return 0;
//        }
//    }
}
