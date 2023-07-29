package fundamentals.algorithm;

import java.util.Arrays;

public class LinearInsertionSort {
    public void methodCall(int[] nums) {
        forLoop(nums);
    }

    private void forLoop(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i-1]){
                int temp = nums[i];
                for (int j = 0; j < i; j++) {
                    if(temp < nums[j]){
                        for (int k = i; k > j; k--) {
                            nums[k] = nums[k - 1];
                        }
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
