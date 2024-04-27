import java.util.Scanner;

public class No126_largest {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

          }
          int sum = 0;
         for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            sum = (sum *10)+ val;
            
         }
         System.out.println(sum + 1);
    }
}
