import java.util.Scanner;

public class slide2_peakelement {
    public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        for (int i = 1; i < n-1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
                System.out.print(arr[i]+" ");
        }
    }
}