import java.util.Scanner;


public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largest(arr, n));

    }
    public static int largest(int arr[], int n) {
        int large = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > large){
                large= arr[i];
            }
        }
        return large;
    }
}
