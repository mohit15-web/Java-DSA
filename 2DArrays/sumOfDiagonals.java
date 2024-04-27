//Sum of Diagonals
import java.util.Scanner;

public class sumOfDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("entered elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int sumL=0;
        int sumR=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j)
                    sumL +=a[i][j];
                if (i+j==n-1)
                    sumR +=a[i][j];
            }
        }
        System.out.println("sum of diagonals");
        System.out.println("sum of right diagonals:"+sumR);
        System.out.println("sum of left diagonals:"+sumL);
    }
}
