package com.JohnTurkson.JavaLessons.implementing;

public interface Rideable {
    void getOn(String rider);
    void getOff(String rider);
    int getCapacity();
    int getPassengers();
    boolean isFull();
}
