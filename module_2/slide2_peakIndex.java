import java.util.Scanner;

public class slide2_peakIndex {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        System.out.println(peakInd(arr, n));
    }
    public static int peakInd(int[] arr,int n){
        for (int i = 1; i < n-1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
            return i;
        }
        return -1;
    }
    
}
