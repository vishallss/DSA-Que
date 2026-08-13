//* https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array

public class Count_frequency{
   public static int frequency(int arr[]){
      boolean visited[] = new boolean[arr.length];
      
      for(int i = 0; i < arr.length; i++){
         if(visited[i] == true){
            continue;
         }
         int count = 0;
         for(int j = 0; j < arr.length; j++){
            if(arr[i] == arr[j]){
               count++;
               visited[j] = true;
            }
         }
          System.out.println(arr[i] + " → " + count);
      }
      return 0;
   }
   public static void main (String args[]){
      int arr[] = {10, 5, 10, 15, 10, 5};
      frequency(arr);
      
      
   }
}



                  //*Chat GPT code

// public static void frequency(int arr[]) {

//     boolean visited[] = new boolean[arr.length];

//     for (int i = 0; i < arr.length; i++) {

//         if (visited[i]) {
//             continue;
//         }

//         int count = 0;

//         for (int j = 0; j < arr.length; j++) {

//             if (arr[i] == arr[j]) {
//                 count++;
//                 visited[j] = true;
//             }
//         }

//         System.out.println(arr[i] + " → " + count);
//     }
// }