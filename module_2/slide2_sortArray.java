

import java.util.*;

public class slide2_sortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        findeven(arr,n);
        findodd(arr,n);
    }
    public static void findeven(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            System.out.print(arr[i]+" ");
        }
    }
     public static void findodd(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1)
            System.out.print(arr[i]+" ");
        }
    }
}
