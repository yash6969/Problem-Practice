public class TargetSumPair {

    public static int[] search(int[] arr, int targetSum){
        
        int leftpointer = 0, rightpointer = arr.length-1;
        while(leftpointer < rightpointer){
            int currentSum = arr[leftpointer] + arr[rightpointer];
            if(currentSum == targetSum)
                return new int[] {leftpointer,rightpointer}; //found the pair

            if(currentSum < targetSum){
                leftpointer++;
            }else{
                rightpointer--;
            }
        }
        
        return new int[] {-1,-1}; //default value no pair found that match the target sum
}
    public static void main(String[] args){
        int[] result = TargetSumPair.search(new int[] {1,2,3,4,5,6}, 6);
        System.out.println("Pair with target sum: ["+result[0]+ "," +result[1]+"]");
        result = TargetSumPair.search(new int[] {2,5,9,11}, 11);
        System.out.println("Pair with target sum: ["+result[0]+ "," +result[1]+"]");
    }
}
