package fundamentals.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithms {
    public static void main(String[] args) {
        int[] nums = intArray();
        System.out.println(Arrays.toString(nums));
        minMax(nums);
    }

    public static int[] intArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number sequence: ");
        String[] line = sc.nextLine().split(" ");
        int[] nums = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        return nums;

    }

    public static void minMax(int[] nums){
        int min = 0;
        int max = 0;
        for (int num : nums) {
            if (min > num) min = num;
            if (max < num) max = num;
        }
        System.out.println("Min = "+ min);
        System.out.println("Max = "+ max);
    }

}
