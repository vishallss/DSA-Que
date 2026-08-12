public class secondLargest {
   public static int SecLargest(int arr[]){
      int largest = Integer.MIN_VALUE;
      int sec_largest = Integer.MIN_VALUE;

      for(int i=0; i<arr.length; i++){
         if(arr[i] > largest){
            sec_largest = largest;
            largest = arr[i];
         }else if(arr[i] > sec_largest && arr[i] != largest){
            sec_largest =arr[i];
         }
         }
         return sec_largest;
      }
      
   
   public static void main (String []args){
      int arr[] = {1, 2, 4, 7, 7}; 
      System.out.println(SecLargest(arr));
   }
}
