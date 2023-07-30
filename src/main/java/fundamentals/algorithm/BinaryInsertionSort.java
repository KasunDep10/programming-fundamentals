package fundamentals.algorithm;

import java.util.Arrays;

public class BinaryInsertionSort {
    public void methodCall(int[] nums) {
        forLoop(nums);
        whileLoop(nums);
        doWhileLoop(nums);
        recursion(nums, 1);
    }


    private int binarySearch(int[] nums, int temp, int end){
        int start = 0;
        while (start < end){
            int mid = (start + end) / 2;
            if(temp == nums[mid]){
                return mid + 1;
            } else if (temp < nums[mid]){
                end = mid;
            } else start = mid + 1;
        }
        return start;
    }

    private void forLoop(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i-1]){
                int temp = nums[i];
                int place = binarySearch(nums, temp, i);
                for (int j = i; j > place; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[place] = temp;
            }
        }
        System.out.println("For Loop " + Arrays.toString(nums));
    }


    private void whileLoop(int[] nums){
        int i = 1;
        while (i < nums.length){
            if(nums[i] < nums[i-1]){
                int temp = nums[i];
                int place = binarySearch(nums, temp, i);
                int j = i;
                while (j > place){
                    nums[j] = nums[j - 1];
                    j--;
                }
                nums[place] = temp;
            }
            i++;
        }
        System.out.println("While Loop " + Arrays.toString(nums));
    }


    private void doWhileLoop(int[] nums){
        int i = 1;
        do {
            if (nums[i] < nums[i - 1]) {
                int temp = nums[i];
                int place = binarySearch(nums, temp, i);
                int j = i;
                do {
                    nums[j] = nums[j - 1];
                    j--;
                } while (j > place);
                nums[place] = temp;
            }
            i++;
        } while (i < nums.length);
        System.out.println("Do-While Loop " + Arrays.toString(nums));
    }

    private void recursion(int[] nums, int i){
        if(i == nums.length){
            System.out.println("Recursion " + Arrays.toString(nums));
            return;
        }
        if(nums[i] < nums[i-1]){
            int temp = nums[i];
            int place = binarySearch(nums, temp, i);
            recursion2(nums, place, i);
        }
        i++;
        recursion(nums, i);
    }

    private void recursion2(int[] nums, int place, int j) {
        if(j <= place) return;
        nums[j] = nums[j - 1];
        j--;
        recursion2(nums, place, j);
    }


}
