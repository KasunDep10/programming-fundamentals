package fundamentals.algorithm;

import java.util.Arrays;

public class LinearInsertionSort {
    public void methodCall(int[] nums) {
        forLoop(nums);
        whileLoop(nums);
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

        System.out.println("For Loop " + Arrays.toString(nums));
    }

    private void whileLoop(int[] nums){
        int i = 1;
        while (i < nums.length){
            if(nums[i] < nums[i-1]){
                int temp = nums[i];
                int j = 0;
                while (j < i){
                    if(temp < nums[j]){
                        int k = i;
                        while(k > j){
                            nums[k] = nums[k - 1];
                            k--;
                        }
                        nums[j] = temp;
                    }
                    j++;
                }
            }
            i++;
        }
        System.out.println("While Loop " + Arrays.toString(nums));
    }
}
