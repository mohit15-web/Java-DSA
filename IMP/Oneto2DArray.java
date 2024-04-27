import java.util.Scanner;

public class Oneto2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int row = sc.nextInt();
        int col = sc.nextInt();
        convert(arr,n,row,col);
    }
    public static void convert(int[] arr,int n,int row,int col){
        int[][] ans = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            int rows = i / col;
            int cols = i % col;
            ans[rows][cols] = arr[i];
        }

        for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
