import java.util.Scanner;

public class No225Query {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

          }
          int start = sc.nextInt();
          int end = sc.nextInt();
          int replace = sc.nextInt();

          for (int i = 0; i < arr.length; i++) {
            if(i >= start && i <=end){
                arr[i] = replace;
            }
            System.out.print(arr[i]+" ");
          }
          
        }
}
