package DSA.Sorting;

public class Selection {
    public static void main(String[] args) {
        //Time Complexity = O(n2)

        int nums[] = {6,5,2,4,8,1,9,7};
        int size = nums.length;
        int temp = 0;
        int minIndex = 0;

        System.out.println("Before Sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("While Sorting");
        for (int i=0;i<size-1;i++){
            minIndex = i;
            for (int j=i+1; j<size;j++){
                if (nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

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
