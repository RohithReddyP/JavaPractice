package packagen;

import java.util.Arrays;

public class Student {
    String name;
    int roll_no;
    int[] marks=new int[5];

    Student(String name, int roll_no, int[] marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    double calculateAvg(){
        int sum =0;
        for (int mark : marks){
            sum+=mark;
        }
        double avg = (double) sum / 5;
        return avg;
    }

    String getGrade(){
        if (calculateAvg()>=90 && calculateAvg()<=100){
            return "A-Grade";
        } else if (calculateAvg()>=80 && calculateAvg()<90) {
            return "B-Grade";
        } else if (calculateAvg()>=60 && calculateAvg()<80) {
            return "C-Grade";
        }else
            return "Fail";
    }

    String display(){
        System.out.println("Student name: "+name);
        System.out.println("Roll no: "+roll_no);
        System.out.println("Marks: "+ Arrays.toString(marks));
        System.out.println("Grade: "+getGrade());
        return "These are the details..";
    }


}