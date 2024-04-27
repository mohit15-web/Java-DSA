import java.util.Arrays;
import java.util.Scanner;

public class slide2_maxProduct {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
       Arrays.sort(arr);
       int max = Math.max(arr[n-1]*arr[n-2]*arr[n-3],arr[0]*arr[1]*arr[n-1]);
        System.out.println(max);
      
    }
}
