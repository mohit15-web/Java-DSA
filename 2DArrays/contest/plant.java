

import java.util.Scanner;

public class plant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(check(arr, n, k));
    }
    public static boolean check(int[] arr,int n,int k){
        int count =0;
        for (int i = 1; i < n-1; i++) {
                if(arr[i] == 0 && arr[i+1] == 0 && arr[i-1] ==0){
                count++;
                i++;
            }
            
            if(arr[0] == 0 && arr[1] == 0)
                count++;

            if(arr[n-1] == 0 && arr[n-2] == 0){
                count++;
            }
        }
        
        
       return count >= k;      
    }
}
