import java.util.Arrays;
import java.util.Scanner;

public class slide3_sumEqualsZero {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[]arr = new int[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
          }
          System.out.println(equalsToZero(arr, n));
    }
    public static boolean equalsToZero(int[] arr,int n){
        
       for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i] + arr[j] == 0)
                return true;
        }
       }
       return false;
    }
}