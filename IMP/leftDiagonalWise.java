import java.util.Scanner;

public class leftDiagonalWise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int gap = 0; gap < n; gap++) {
            for (int i = 0,j=gap; j >= 0; j--,i++) {
                System.out.print(arr[i][j]+" ");
            }
        }

         for (int gap = 1; gap < n; gap++) {
            for (int j = n-1,i=gap; i < n; j--,i++) {
                System.out.print(arr[i][j]+" ");
            }
        }

    }
}
