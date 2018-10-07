package com.JohnTurkson.JavaLessons.overriding;

public class Animal {
    protected String name;
    protected String sound;
    protected String type;
    
    // Default animal constructor
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
        this.type = "animal";
    }
    
    // Overloaded constructor
    public Animal(String name, String sound, String type) {
        this.name = name;
        this.sound = sound;
        this.type = type;
    }
    
    public void sayName() {
        System.out.println("My name is " + name + ".");
    }
    
    public void sayType() {
        if (type.matches("$[aeiou]]")) {
            System.out.println("I am an " + type + ".");
        } else {
            System.out.println("I am a " + type + ".");
        }
    }
    
//    public void makeSound() {
//        System.out.println("The sound I make is: " + sound);
//    }
//
//    @Override
//    public String toString() {
//        if (type.matches("$[aeiou]")) {
//            return "This is an " + type + ".";
//        }
//        return "This is a " + type + ".";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null) {
//            return false;
//        }
//        if (o instanceof Animal) {
//            Animal a = (Animal) o;
//            return this.name.equals(a.name) &&
//                    this.sound.equals(a.sound) &&
//                    this.type.equals(a.type);
//        }
//        return false;
//    }
}
