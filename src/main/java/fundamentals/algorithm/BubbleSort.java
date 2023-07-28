package fundamentals.algorithm;

import java.util.Arrays;

public class BubbleSort {
    public void methodCall(int[] nums) {
        forLoopMin(nums);
        forLoopMax(nums);
        whileMin(nums);
        whileMax(nums);
        doWhileMin(nums);
        doWhileMax(nums);
        recursion(nums, 0, 0);
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


    private void whileMin(int[] nums){
        int i = nums.length - 1;
        while (i > 0){
            int temp;
            int j = nums.length - 1;
            while (j > nums.length - 1 - i){
                if(nums[j] < nums[j - 1]){
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
                j--;
            }
            i--;
        }
        System.out.println("whileMin " + Arrays.toString(nums));
    }

    private void whileMax(int[] nums){
        int i = 0;
        while (i < nums.length - 1) {
            int temp;
            int j = 0;
            while (j < nums.length - 1 - i) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                j++;
            }
            i++;
        }

        System.out.println("whileMax " + Arrays.toString(nums));
    }


    private void doWhileMin(int[] nums){
        int i = nums.length - 1;
        do {
            int temp;
            int j = nums.length - 1;
            do {
                if(nums[j] < nums[j - 1]){
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
                j--;
            } while (j < nums.length - 1 - i);
            i--;
        } while (i > 0);

        System.out.println("doWhileMin " + Arrays.toString(nums));
    }

    private void doWhileMax(int[] nums){
        int i = 0;
        do {
            int temp;
            int j = 0;
            do {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                j++;
            } while (j < nums.length - 1 - i);
            i++;
        } while (i < nums.length - 1);

        System.out.println("doWhileMax " + Arrays.toString(nums));
    }


    private void recursion(int[] nums, int i, int j){
        if(i == (nums.length - 1)){
            System.out.println("recursion " + Arrays.toString(nums));
            return;
        }
        if(j == (nums.length - 1 - i)){
            j = 0;
            i++;
            recursion(nums, i, j);
            return;
        }
        if(nums[j] > nums[j + 1]){
            int temp = nums[j];
            nums[j] = nums[j + 1];
            nums[j + 1] = temp;
            j++;
            recursion(nums, i, j);
            return;
        }
        j++;
        recursion(nums, i, j);
    }
}
