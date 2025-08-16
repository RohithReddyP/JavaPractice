package DSA.Sorting;

public class Bubble {
    public static void main(String[] args) {
        //Time Complexity = O(n2)
        int nums[] = {6,5,2,4,8,1,9,7};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before Sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }

        System.out.println("While Sorting");
        for (int i=0; i<size; i++){
            for (int j=0; j<size-i-1; j++){
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println();
            for (int num : nums){
                System.out.print(num + " ");
            }
        }


        System.out.println();
        System.out.println("After Sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }

    }
}
