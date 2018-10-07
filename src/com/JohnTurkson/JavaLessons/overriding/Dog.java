package com.JohnTurkson.JavaLessons.overriding;

public class Dog extends Animal {
    
    public Dog(String name) {
        super(name, "woof", "dog");
    }
    
//    @Override
//    public void makeSound() {
//        System.out.println(sound + "!");
//    }
//
//    @Override
//    public String toString() {
//        return sound + ", " + sound + "! " + "I am a dog. My name is" + name + ". ";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null) {
//            return false;
//        }
//        if (o instanceof Dog) {
//            Dog c = (Dog) o;
//            return this.name.equals(c.name);
//        }
//        return false;
//    }
}
