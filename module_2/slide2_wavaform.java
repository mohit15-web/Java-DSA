import java.util.Arrays;
import java.util.Scanner;

public class slide2_wavaform {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n-2; i+=2) {
            swap(arr,i,i+1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr,int x ,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
