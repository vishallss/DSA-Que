public class removeDuplicates {

    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {

                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 3, 3, 5, 6};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array: ");

        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}