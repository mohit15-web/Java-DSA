import java.util.Arrays;
import java.util.Scanner;

public class slide3_sortByCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          Integer[]arr = new Integer[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
          }
          Arrays.sort(arr,(a,b) ->{
            return a*a*a - b*b*b;
          });
          for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
          }
    }
}
