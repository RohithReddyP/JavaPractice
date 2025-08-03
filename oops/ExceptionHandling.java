package oops;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index accessed.");
        }
        catch (Exception e) {
            System.out.println("General exception: " + e);
        }
        finally {
            System.out.println("This block always runs.");
        }

        try {
            checkAge(15);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Access granted.");
        }
    }
}