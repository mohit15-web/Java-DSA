import java.util.Scanner;

public class sumOfSubarrays {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bruteApproch(arr, n);
        kadaneAlgo(arr, n);
       
    }
    public static void kadaneAlgo(int[] arr,int n){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum +=arr[i];
            if(currSum < 0){
            currSum =0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);

    }
    public static void bruteApproch(int[] arr,int n){
         int maxSum =  Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum =0;
                for (int k = i; k <= j; k++) {
                    sum +=arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }
}
