package Inheritance;

public class Main {
    public static void main(String[] args) {
    Child c1 = new Child("Ramesh",40);
    Child c2 = new Child("Suresh",43);
    Child c3 = new Child("Sujatha",39);

    Adult a1 = new Adult("Prakash",40);
    Adult a2 = new Adult("Babu",41);
    Adult a3 = new Adult("Reddy",45);

    System.out.println("**********Child 1 Parent Details**********");
    c1.parentInfo();
    System.out.println("**********Child 1 Details**********");
    c1.childInfo("Ravi",18);
    System.out.println("**********Child 1 Ask Money**********");
    c1.askMoney(10);
    System.out.println("**********Child 2 Parent Details**********");
    c2.parentInfo();
    System.out.println("**********Child 2 Details**********");
    c2.childInfo("Sita",16);
    System.out.println("**********Child 2 Ask Money**********");
    c1.askMoney(100);
    System.out.println("**********Child 3 Parent Details**********");
    c3.parentInfo();
    System.out.println("**********Child 3 Details**********");
    c3.childInfo("Ramu",17);
    System.out.println("**********Child 3 Ask Money**********");
    c1.askMoney(20);


    }
}
