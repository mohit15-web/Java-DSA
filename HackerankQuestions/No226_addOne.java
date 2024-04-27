import java.util.Scanner;

public class No226_addOne {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

          }
          int[] finalResult = index(arr);
          for (int i = 0; i < finalResult.length; i++) {
            System.out.print(finalResult[i]+" ");
          }
          
     }
     public static int[] index(int[] arr){
       for (int i = arr.length-1; i>=0;i--) {
        if(arr[i] == 9){
            arr[i] = 0;
        }else {
            arr[i]++;
            return arr;
        }
       }

       int[] result = new int[arr.length + 1];
       result[0] = 1;
       return result;
          
     }
}
