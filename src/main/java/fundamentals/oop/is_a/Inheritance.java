package fundamentals.oop.is_a;

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

class Animal {
    public void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog bark..!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meow..!");
    }
}
