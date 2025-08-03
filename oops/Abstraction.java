package oops;


abstract class Shape {
    abstract void draw();

    void info() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle ");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square ");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();
        s1.info();
        s2.draw();
        s2.info();
    }
}