package DSA;

public class dsaBasic {
    public static void main(String[] args) {
        //sorted array
        int arr[] = {12,22,34,45,65,70,99};

        //access element in an array

        //System.out.println(arr[3]);     //for this time complexity is constant

        // so time complexity is O(1)
        //searching
        int target = 70;

        int result1 = linearSearch(arr, target);
        System.out.println("***Linear Search***");
        if (result1 != -1){
            System.out.println("Element Found at Index: " +result1);
        } else {
            System.out.println("Element not Found!");
        }
        int result2 = binarySearch(arr, target);
        System.out.println("***Binary Search***");
        if (result2 != -1){
            System.out.println("Element Found at Index: " +result2);
        } else {
            System.out.println("Element not Found!");
        }


    }
    //linear search
    public static int linearSearch(int[] arr, int target) {
        int steps=0;
        for (int i=0; i<arr.length; i++){
            steps++;
            if (arr[i] == target) {
                System.out.println("Steps taken by LS: "+steps);
                return i;
            }
        }
        System.out.println("Steps taken by LS: "+steps);
        return -1;
    }
    //binary search
    public static int binarySearch(int[] arr, int target) {
        int steps = 0;
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            steps++;
            int mid = (left + right)/2;

            if (arr[mid]==target){
                System.out.println("Steps taken by BS: "+steps);
                return mid;
            } else if (target<arr[mid]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        System.out.println("Steps taken by BS: "+steps);
        return -1;
    }
}
