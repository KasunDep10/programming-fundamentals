package fundamentals.algorithm;

import java.util.Arrays;

public class SelectionSort {
    public void methodCall(int[] nums) {
        forLoopMin(nums);
        forLoopMax(nums);
        whileMin(nums);
        whileMax(nums);
    }


    private void forLoopMin(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = nums[i];
            nums[i] = min;
        }
        System.out.println("forLoopMin " + Arrays.toString(nums));
    }

    private void forLoopMax(int[] nums){
        for (int i = nums.length - 1; i >= 0 ; i--) {
            int max = nums[i];
            int maxIndex = i;
            for (int j = i; j >= 0; j--) {
                if(max < nums[j]){
                    max = nums[j];
                    maxIndex = j;
                }
            }
            nums[maxIndex] = nums[i];
            nums[i] = max;
        }
        System.out.println("forLoopMax " + Arrays.toString(nums));
    }


    private void whileMin(int[] nums){
        int i = 0;
        while(i < nums.length){
            int min = nums[i];
            int minIndex = i;
            int j = i;
            while(j < nums.length){
                if(min > nums[j]){
                    min = nums[j];
                    minIndex = j;
                }
                j++;
            }
            nums[minIndex] = nums[i];
            nums[i] = min;
            i++;
        }
        System.out.println("whileMin " + Arrays.toString(nums));
    }

    private void whileMax(int[] nums){
        int i = nums.length - 1;
        while(i >= 0){
            int max = nums[i];
            int maxIndex = i;
            int j = i;
            while(j >= 0){
                if(max < nums[j]){
                    max = nums[j];
                    maxIndex = j;
                }
                j--;
            }
            nums[maxIndex] = nums[i];
            nums[i] = max;
            i--;
        }
        System.out.println("whileMax " + Arrays.toString(nums));
    }

}
