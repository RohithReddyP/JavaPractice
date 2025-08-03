package packagen;

public class Mainn {
    public static void main(String[] args) {
        int[] s1marks = {45,56,97,65,47};
        int[] s2marks = {45,55,96,64,17};
        int[] s3marks = {91,93,96,97,90};
        Student student1 = new Student("Ravi",100,s1marks);
        Student student2 = new Student("Ramu",101,s2marks);
        Student student3 = new Student("Sita",102,s3marks);

        System.out.println(student1.calculateAvg());
        System.out.println(student1.getGrade());
        System.out.println(student1.display());

        System.out.println(student2.calculateAvg());
        System.out.println(student2.getGrade());
        System.out.println(student2.display());

        System.out.println(student3.calculateAvg());
        System.out.println(student3.getGrade());
        System.out.println(student3.display());
    }
}
