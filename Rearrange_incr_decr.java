// Rearrange array in increasing-decreasing order
// https://takeuforward.org/data-structure/rearrange-array-in-increasing-decreasing-order
import java.util.*;

public class Rearrange_incr_decr {

    public static void rearrange(int arr[]) {

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Reverse the second half
        int i = arr.length / 2;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 2, 9, 1, 6, 3};

        rearrange(arr);

        // Print array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}