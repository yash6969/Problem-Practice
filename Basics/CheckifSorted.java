public class CheckifSorted {

      static boolean isSortedHelper(int arr[], int n){
          //base case
           if(n == 0 || n == 1)
              return true;
            
           //check if the previous and next element adjacent to current element is in sorted or not
           return arr[n-1] >= arr[n-2] && isSortedHelper(arr, n-1);
    
      }

      static boolean isSorted(int arr[]){
          return isSortedHelper(arr,arr.length);
      }
      public static void main(String[] args){
           int arr[] = {10,20,40,30,50};

           if(isSorted(arr)){
              System.out.println("Yes. Arrays is sorted");
           }else{
              System.out.println("No. Arrays is not sorted");
           }
      }    
}
