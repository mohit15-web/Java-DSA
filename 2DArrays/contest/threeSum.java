

import java.util.Arrays;
import java.util.Scanner;

public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        sum(arr,n);
    }
    public static void sum(int[] arr,int n){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            while(i > 0 && arr[i] == arr[i - 1]){
                i++;
            }
            int target = -1 * arr[i];
            int p1 = i + 1;
            int p2 = n - 1;
            while(p1 < p2){
                int sum = arr[p1] + arr[p2];
                if(sum == target){
                    System.out.print(arr[i]+" "+arr[p1]+" "+arr[p2]);
                    p1++;
                    p2--;
                }else if(sum < target){
                    p1++;
                }else{
                    p2--;
                }
            }
        }
    }
}
