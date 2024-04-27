import java.util.Scanner;

public class No224_solveArray {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

          }
          int[] index = new int[n];
          for (int i = 0; i < index.length; i++) {
               index[i] = sc.nextInt();
          }
          int[] target = solveArray(arr,index);
          for (int i = 0; i < target.length; i++) {
            System.out.print(target[i]+" ");
          }
          
          
     }
     public static int[] solveArray(int[] arr, int[] index ){
          int n = arr.length;
          int[] target = new int[n];

        for (int i = 0; i < n; i++) {
          target[index[i]] = arr[i];
        }
          return target;
     }
}

