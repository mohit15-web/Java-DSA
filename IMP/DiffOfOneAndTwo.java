import java.util.Scanner;

public class DiffOfOneAndTwo {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

       int[] rowOne = new int[n];
       int[] rowZero = new int[n];
       int[] colOne = new int[m];
       int[] colZero = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 1){
                    rowOne[i]++;
                    colOne[j]++;
                }else{
                    rowZero[i]++;
                    colZero[j]++;
                }
            }
        }

        int[][] ans = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = rowOne[i] + colOne[j] - rowZero[i] - colZero[j];
                ans[i][j] = temp; 
            }
        }
    }
}
