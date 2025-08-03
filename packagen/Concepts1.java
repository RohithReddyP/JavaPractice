package packagen;

// Demonstrating Variables, Primitive & Reference Types, Strings, and All Data Types
import java.util.Arrays;

public class Concepts1 {
    public static void main(String args[]) {
        // 1️⃣ Primitive Data Types 🚀
        byte smallNumber = 127;        // 8-bit integer
        short mediumNumber = 32000;    // 16-bit integer
        int wholeNumber = 100000;      // 32-bit integer
        long largeNumber = 100000000L; // 64-bit integer (suffix 'L' required)
        float decimalNumber = 10.99f;  // 32-bit floating-point (suffix 'f' required)
        double preciseDecimal = 99.9999; // 64-bit floating-point
        char singleCharacter = 'A';    // Single character (uses single quotes)
        boolean isJavaFun = true;      // Boolean (true/false)

        // 2️⃣ Reference Data Types 🌟
        String text = "Hello, Java!";  // String is an object (reference type)
        int[] numbersArray = {1, 2, 3, 4, 5}; // Array (reference type)
        Person person = new Person("Rohith", 20); // Custom object

        // 3️⃣ Printing All Variables 🎉
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + mediumNumber);
        System.out.println("Int: " + wholeNumber);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + decimalNumber);
        System.out.println("Double: " + preciseDecimal);
        System.out.println("Char: " + singleCharacter);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + text);
        System.out.println("Array: " + Arrays.toString(numbersArray));

        // Accessing object properties
        System.out.println("Person's Name: " + person.name);
        System.out.println("Person's Age: " + person.age);
    }
}

// 4️⃣ Custom Class (Reference Type)
class Person {
    String name; // Instance variables (Reference type)
    int age; // Instance variable (Primitive type)

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
