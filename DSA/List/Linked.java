package DSA.List;

public class Linked {
    public static void main(String[] args) {

        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(4);
        nums.addFirst(10);
        nums.delete(4);
        nums.printValues();

    }
}
