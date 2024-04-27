import java.util.Scanner;

public class slide3_sumEqualsOne {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[]arr = new int[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
          }
          System.out.println(equalsToOne(arr, n));
    }
    public static boolean equalsToOne(int[] arr,int n){
        
       for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            int sum = arr[i] + arr[j];
            if(sum == 1)
            return true;
        }
       }
       return false;
    }
}
