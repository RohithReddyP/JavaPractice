package packagen;
import java.util.Scanner;

class Add{
    int a,b;
    public Add(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = Integer.parseInt(s.nextLine());
        System.out.println("Enter the value of b:");
        b = Integer.parseInt(s.nextLine());
    }
    void sum() {
        System.out.println("Sum is:"+(a+b));
    }
}

public class Main {
    public static void main(String[] args) {
        Add add= new Add();
        add.sum();
    }
}
