package DSA;

public class Recursion {
    public static void main(String[] args) {
        int result = fact(6);
        System.out.println(result);
    }

    public static int fact(int i){
        if(i!=0){
            return i*fact(i-1);
        }
        return 1;
    }
}
//5! = 5*4*3*2*1
//5! = 5*4!