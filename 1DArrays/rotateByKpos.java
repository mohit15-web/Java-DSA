import java.util.Arrays;
import java.util.Scanner;

public class rotateByKpos {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans[] = rotate(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] rotate(int[] arr,int k){

        int n = arr.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[(i+k)%n] = arr[i];
        }
        return ans;
    }
}
