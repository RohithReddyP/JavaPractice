package oops;


class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("The dog says: Woof!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("The cat says: Meow!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
