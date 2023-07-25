package fundamentals.algorithm;

public class LinearSearch {
    public void methodCall(int[] nums, int search){
        forLoop(nums, search);
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
}
