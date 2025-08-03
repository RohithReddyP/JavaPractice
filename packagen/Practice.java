package packagen;

import java.util.Scanner;

public class Practice {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("OPTIONS");
        System.out.println("1.To find entered number is even or odd\n" +
                "2.To make a simple calculator using Switch\n" +
                "3.To find Largest number among three\n" +
                "4.To find Factorial of a number\n" +
                "5.To sum digits of a number\n" +
                "6.To do Fibonacci\n" +
                "7.To reverse a number\n" +
                "8.To check whether the number is a Palindrome or not\n" +
                "9.Multiplication Table\n" +
                "10.Count no of digits in a number\n" +
                "11.Sum of first n natural numbers\n" +
                "12.Pattern of stars*\n");
        System.out.print("Enter an option:");
        String option = scanner.next();
        switch (option){
            case "1":
                EvenOdd();
                break;
            case "2":
                Calculator();
                break;
            case "3":
                LargestAmongThree();
                break;
            case "4":
                Factorial();
                break;
            case "5":
                SumDigits();
                break;
            case "6":
                Fibonacci();
                break;
            case "7":
                Reverse();
                break;
            case "8":
                Palindrome();
                break;
            case "9":
                Table();
                break;
            case "10":
                DigCount();
                break;
            case "11":
                SumOfN();
                break;
            case "12":
                Pattern();
                break;
            default:
                System.out.println("Enter valid Option....");
                break;
        }
    }

    //To find entered number is even or odd
    static void EvenOdd() {
        System.out.print("Enter a number:");
        int i = scanner.nextInt();
        if (i % 2 == 0)
            System.out.println(i + " is an Even number.");
        else
            System.out.println(i + " is an Odd number.");
    }

    //To make a simple calculator using Switch
    static void Calculator() {
        System.out.print("Enter first value:");
        int a = scanner.nextInt();
        System.out.print("Enter an operator:");
        String op = scanner.next();
        System.out.print("Enter second value:");
        int b = scanner.nextInt();

        switch (op) {
            case "+":
                System.out.println("Result: " + a + "+" + b + "=" + (a + b));
                break;
            case "-":
                System.out.println("Result: " + a + "-" + b + "=" + (a - b));
                break;
            case "*":
                System.out.println("Result: " + a + "*" + b + "=" + (a * b));
                break;
            case "/":
                System.out.println("Result: " + a + "/" + b + "=" + (a / b));
                break;
            case "%":
                System.out.println("Result: " + a + "%" + b + "=" + (a % b));
                break;
            default:
                System.out.println("Enter operators[+,-,*,/,%]");
                break;
        }
    }

    //To find Largest number among three
    static void LargestAmongThree() {
        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a >= b && a >= c)
            System.out.println(a + " is the largest number.");
        else if (b >= a && b >= c)
            System.out.println(b + " is the largest number.");
        else
            System.out.println(c + " is the largest number.");
    }

    //To find Factorial of a number
    static void Factorial() {
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is:" + fact);
    }

    //To sum digits of a number
    static void SumDigits() {
        System.out.print("Enter a number:");
        long num = scanner.nextLong();
        long sum = 0;
        while (num != 0) {
            long digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits is:" + sum);
    }

    //To do Fibonacci
    static void Fibonacci() {
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(first + "");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    //To reverse a number
    static void Reverse() {
        System.out.print("Enter a number to reverse:");
        int n = scanner.nextInt();
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse of the number " + n + " is:" + rev);
    }

    //To check whether the number is a Palindrome or not
    static void Palindrome() {
        System.out.print("Enter the number:");
        int num = scanner.nextInt();
        int original = num;
        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            result = result * 10 + digit;
            num = num / 10;
        }
        if (original == result)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is not a Palindrome");
    }

    //Multiplication Table
    static void Table() {
        System.out.print("Enter what table you want:");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + (n * i));
        }
    }

    //Count no of digits in a number
    static void DigCount() {
        System.out.print("Enter a number:");
        int num = scanner.nextInt();
        String count = String.valueOf(num);
        System.out.println("The number of digits in " + num + " is:" + count.length());
    }

    //Sum of first n natural numbers
    static void SumOfN() {
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        long sum =0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum:" + sum);
    }

    //Pattern of stars*
    static void Pattern(){
        System.out.print("Enter the number of rows you want:");
        int rows = scanner.nextInt();
        for (int i = 1;i<=rows;i++){
            for (int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}