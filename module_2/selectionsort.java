import java.util.Scanner;

public class selectionsort {
    
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
        for (int i = 0; i < n-1; i++) {
         int mini =i;
         for (int j = i+1; j < n; j++) {
            if(arr[j] < arr[mini]){
                mini = j;
            }
            swap(arr, i, mini);
         }
        }
    }
    public static void swap(int[] arr,int x,int y){
          int temp = arr[x];
          arr[x] = arr[y];
         arr[y] = temp;
    }
}
