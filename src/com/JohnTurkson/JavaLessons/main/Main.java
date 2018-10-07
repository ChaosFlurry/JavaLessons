package com.JohnTurkson.JavaLessons.main;

import com.JohnTurkson.JavaLessons.overriding.Animal;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("D", "woof", "dog");
        Animal cat = new Animal("C", "meow", "cat");
        
        Animal penguin = new Animal("P", "honk", "penguin");
    }
}
