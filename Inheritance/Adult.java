package Inheritance;

public class Adult extends Child{
    Adult(String parentName,int parentAge){
        super(parentName,parentAge);
    }

    void adultInfo(String adultName,int adultAge){
        System.out.println("Adult Name: "+adultName);
        System.out.println("Adult Age: "+adultAge);
    }
}
