package com.JohnTurkson.JavaLessons.overriding;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, "meow", "cat");
    }
    
//    @Override
//    public void makeSound() {
//        System.out.println(sound + "!");
//    }
    
//    @Override
//    public String toString() {
//        return sound + ". " + "I am a cat. My name is" + name + ". ";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof Cat) {
//            Cat c = (Cat) o;
//            return this.name.equals(c.name);
//        }
//        return false;
//    }
}
