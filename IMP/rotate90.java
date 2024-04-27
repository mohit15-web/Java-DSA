import java.util.Scanner;

public class rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr,n);
    }
    public static void rotate(int[][] arr,int n){
        // step 1 find franspose
        transpose(arr,n);

        //step 2 swap cols
        swapCol(arr,n);

        //step 3 print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void swapCol(int[][] arr, int n) {
        for (int row = 0; row < n; row++) {
            int i=0;
            int j=n-1;
            while(i < j){
                int temp = arr[row][i];
                arr[row][i] = arr[row][j];
                arr[row][j] = temp;

                i++;
                j--;
            }
        }
    }
    public static void transpose(int[][] arr,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j >= i){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
}
