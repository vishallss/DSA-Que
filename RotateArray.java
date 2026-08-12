// https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1


// import java.util.*;

// class Solution {

//     public static void rotateArr(int arr[], int d) {

//         d = d % arr.length;

//         for (int i = 0; i < d; i++) {

//             int first = arr[0];

//             for (int j = 0; j < arr.length - 1; j++) {
//                 arr[j] = arr[j + 1];
//             }

//             arr[arr.length - 1] = first;
//         }
//     }

//     public static void main(String args[]) {

//         int arr[] = {1, 2, 3, 4, 5, 6};
//         int d = 2;

//         rotateArr(arr, d);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


                         //OR  optimized

import java.util.*;

public class rotateArr {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void leftRotate(int[] arr, int d) {

        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        leftRotate(arr, d);

        System.out.println(Arrays.toString(arr));
                        //or
   //      for (int i = 0; i < arr.length; i++) {
   //      System.out.print(arr[i] + " ");
   //   }
    }
}