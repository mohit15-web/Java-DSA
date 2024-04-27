import java.util.Scanner;

public class No228_Query2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int left = sc.nextInt();
        int right = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if(i >= 0 && i <= left){
                arr[i] +=x;
            } else if(i >= right && i<=n){
                arr[i] +=x;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

 }
