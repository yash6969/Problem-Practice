public class CheckifSorted {

      static boolean isSorted(int[] arr) {
          // Handle null or arrays with 0/1 elements
          if (arr == null || arr.length <= 1) {
              return true;
          }
          
          for (int i = 1; i < arr.length; i++) {
              // If the current element is smaller than the previous one, array is not sorted
              if (arr[i] < arr[i - 1]) {
                  return false;
              }
          }
          
          return true;
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
