//* Calculate Sum of the Elements of the Array  */
// BUG: Problem Statement: Given an array arr of size n, the task is to find the sum of all the elements in the array .

public class Sum_of_Elements{
   public static int summ (int arr[]){
      int sum = 0;
      for (int i=0; i<arr.length; i++){
        sum = sum + arr[i]; 
      }
      return sum;
   }
      public static void main(String [] args){
      int arr[] = {1,2,3,4,5,1};

      
         System.out.println(summ(arr));
      
   }
}






//            Optimal Approach
// import java.util.*;

// class Solution {
       // Function to calculate sum of array elements using streams
//     public int arraySum(int[] arr) {
         // Use Arrays.stream to create IntStream and sum it
//         return Arrays.stream(arr).sum();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] arr = {1, 2, 3, 4, 5};
//         System.out.println(sol.arraySum(arr));
//     }
// }
