package Inheritance;

public class Parent {
    String  parentName;
    int parentAge;

    Parent(String parentName,int parentAge){
        this.parentName = parentName;
        this.parentAge = parentAge;
    }

    void parentInfo(){
        System.out.println("Parent Name: "+parentName);
        System.out.println("Parent Age: "+parentAge);
    }

    void askMoney(int howMuch){
        System.out.println(howMuch+" Money Given..");
        System.out.println("Use it Carefully");
    }
}
