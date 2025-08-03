package Inheritance;

public class Child extends Parent{

    Child(String parentName, int parentAge){
        super(parentName,parentAge);
    }

    void childInfo(String childName,int childAge){
        System.out.println("Child Name: "+childName);
        System.out.println("Child Age: "+childAge);
    }
}
