package contest;

import java.util.Scanner;

public class rotation {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        if(rotationCheck(arr, n)){
            System.out.println();
        }else{
            System.out.println();
        }

 }  
 public static boolean rotationCheck(int[][]arr,int n){
    for (int i = 0; i < n; i++) {
        int[] rotated = rotate(arr[i],n);
        //3 1 2

        boolean isAvailable = false;
        for (int j = 0; j < n; j++) {
            if(equal(arr[j],rotated,n) == true){
                isAvailable = true;
            }
        }
        if(isAvailable == false){
            return false;
        }
    }
    return true;
 }
public static boolean equal(int[] arr1, int[] arr2, int n) {
    for (int i = 0; i < n; i++) {
        if(arr1[i] != arr2[i])
        return false;
    }
    return true;
}
public static int[] rotate(int[] arr, int n) {
    int[] rotated = new int[n];
    for (int i = 1; i < n; i++) {
        rotated[i] = arr[i-1];
    }
    rotated[0] = arr[n-1];
    return rotated;
} 
}
