package Patterns;
import java.util.Arrays;

public class AvgOfSubArray {

    public static double[] findAverage(int k, int[] arr){
        double[] result = new double[arr.length - k + 1];
        
        for(int i=0;i<arr.length-k;i++){
            double sum = 0;
                for(int j=i; j<i+k;j++){
                    sum = sum + arr[j];
                    result[i] = sum/k;
                }
        }

       return result;
    }

    public static void main(String[] args){
        double[] results = AvgOfSubArray.findAverage(5, new int[] {1,3,2,6,-1, 4,1,8,2});

        System.out.println("Averages of subarray of size k: " +Arrays.toString(results));
    }
}