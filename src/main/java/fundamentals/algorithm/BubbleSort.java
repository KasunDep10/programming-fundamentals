package fundamentals.algorithm;

import java.util.Arrays;

public class BubbleSort {
    public void methodCall(int[] nums) {
        forLoopMin(nums);
        forLoopMax(nums);
    }


    private void forLoopMin(int[] nums){
        for (int i = nums.length - 1; i > 0; i--) {
            int temp;
            for (int j = nums.length - 1; j >= nums.length - i; j--) {
                if(nums[j] < nums[j - 1]){
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

        System.out.println("forLoopMin " + Arrays.toString(nums));
    }

    private void forLoopMax(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            int temp;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("forLoopMax " + Arrays.toString(nums));
    }
}
