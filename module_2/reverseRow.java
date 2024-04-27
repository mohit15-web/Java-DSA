import java.io.*;
import java.util.*;

public class reverseRow {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        alternateRow(arr,n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void reverseRows(int[]arr,int si,int ei){
        
        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            
            si++;
            ei--;
        }
    }
    public static void alternateRow(int[][]arr,int n){
        
        for (int i = 0; i < n; i++) {
            if(i%2==1)
              reverseRows(arr[i],0,n-1);
            }
    }
}