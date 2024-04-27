import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        insertion(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertion(int[] arr,int n){
        for (int i = 1; i <= n-1; i++) {
         for (int j = i-1; j >= 0; j--) {
            if(arr[j] > arr[j+1]){
              swap(arr,j,j+1);
            }
         }
        }
    }
    public static void swap(int[] arr,int x,int y){
          int temp = arr[x];
          arr[x] = arr[y];
         arr[y] = temp;
    }
   }

