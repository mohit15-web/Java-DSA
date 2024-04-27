import java.util.Scanner;

public class No246_storeMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int[] arr = new int[n];
       for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
       }
       int[]left = leftMaximum(arr,n);
       int[]right = rightMaximum(arr,n);

       int ans=0;
       for (int i = 1; i <= n-2; i++) {
        ans = ans + Math.min(left[i], right[i]) - arr[i];
       }
       System.out.println(ans);
    }
    public static int[] leftMaximum(int[] arr,int n){
        int[] left = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
        return left;
    }
    public static int[] rightMaximum(int[] arr,int n){
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for (int i = n-2; i>=0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }
        return right;
    }
}
