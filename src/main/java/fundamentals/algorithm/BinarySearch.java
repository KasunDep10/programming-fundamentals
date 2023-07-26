package fundamentals.algorithm;

public class BinarySearch {
    public void methodCall(int[] nums, int search){
        forLoop(nums, search);
        whileLoop(nums, search);
        doWhileLoop(nums, search);
    }


    private void forLoop(int[] nums, int search){
        int start = 0;
        int end = nums.length;
        int mid = 0;
        if (search < nums[start] || search > nums[end - 1]) {
            System.out.println("The searched number does not exist");
            return;
        }

        for( ; true ; ){
            mid = (start + end)/2;
            if(start >= end) {
                System.out.println("The searched number does not exist");
                return;
            }
            if(search == nums[mid]){
                System.out.printf("%s is found at index: %d \n", search, mid);
                return;
            } else if(search < nums[mid]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
    }

    private void whileLoop(int[] nums, int search){
        int start = 0;
        int end = nums.length;
        int mid = 0;
        if(search < nums[start] || search > nums[end -1]){
            System.out.println("The searched number does not exist");
            return;
        }
        while(start < end){
            mid = (start + end)/2;
            if(search == nums[mid]){
                System.out.printf("%s is found at index: %d \n", search, mid);
                return;
            } else if(search < nums[mid]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("The searched number does not exist");
    }

    private void doWhileLoop(int[] nums, int search) {
        int start = 0;
        int end = nums.length;
        int mid = 0;
        if (search < nums[start] || search > nums[end - 1]) {
            System.out.println("The searched number does not exist");
            return;
        }

        do {
            mid = (start + end) / 2;
            if (search == nums[mid]) {
                System.out.printf("%s is found at index: %d \n", search, mid);
                return;
            } else if (search < nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        } while (start < end);

        System.out.println("The searched number does not exist");
    }
}
