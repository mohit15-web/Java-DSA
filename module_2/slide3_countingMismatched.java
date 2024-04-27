import java.util.Arrays;
import java.util.Scanner;

public class slide3_countingMismatched {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[]arr = new int[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
          }
          int[] height = mismatch(arr, n);
          int count =0;
          for (int i = 0; i < height.length; i++) {
            if(arr[i] != height[i])
               count++;
          }
          System.out.println(count);
    }
    public static int[] mismatch(int[] arr,int n){
        int[] height = new int[n];
        for (int i = 0; i < height.length; i++) {
            height[i] = arr[i];
        }
        Arrays.sort(height);

        return height;
    }
}
