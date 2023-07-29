package fundamentals.algorithm;

import java.util.Arrays;

public class BinaryInsertionSort {
    public void methodCall(int[] nums) {
        whileLoop(nums);
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



}