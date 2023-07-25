package fundamentals.algorithm;

public class LinearSearch {
    public void methodCall(int[] nums, int search){
        forLoop(nums, search);
        whileLoop(nums, search);
        doWhileLoop(nums, search);
        recursion(nums, search, 0);
    }

    private void forLoop(int[] nums, int search){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == search){
                System.out.printf("%s is found at index: %d \n", search, i);
                return;
            }
        }
        System.out.println("The searched number does not exist");
    }

    private void whileLoop(int[] nums, int search){
        int i = 0;
        while (i < nums.length){
            if(nums[i] == search){
                System.out.printf("%s is found at index: %d \n", search, i);
                return;
            }
            i++;
        }
        System.out.println("The searched number does not exist");
    }

    public void doWhileLoop(int[] nums, int search){
        int i = 0;
        do {
            if(nums[i] == search){
                System.out.printf("%s is found at index: %d \n", search, i);
                return;
            }
            i++;
        } while (i < nums.length);
        System.out.println("The searched number does not exist");
    }

    public void recursion(int[] nums, int search, int i){
        if(i == nums.length){
            System.out.println("The searched number does not exist");
            return;
        }
        if(search == nums[i]){
            System.out.printf("%s is found at index: %d \n", search, i);
            return;
        }
        i++;
        recursion(nums, search, i);
    }
}
