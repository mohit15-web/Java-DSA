import java.util.Scanner;

public class interchangeOfDiagonal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("enter the elemets of matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("matix before interchanging:");
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int temp = arr[i][i];
            arr[i][i] = arr[i][n-1-i];
            arr[i][n-1-i] = temp;
        }
        System.out.println("matrix after swapping");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
