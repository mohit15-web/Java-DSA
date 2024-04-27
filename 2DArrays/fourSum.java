import java.util.Arrays;
import java.util.Scanner;

public class fourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        sum(arr, n, target);
        }
    
    public static void sum(int[] arr,int n,int target){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i-1]) {
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if (j > (i+1) && arr[j] == arr[j-1]) {
                    continue;
                }

                int p1 = j+1;
                int p2 = n-1;
                while (p1 < p2) {
                    while (p1 < p2 && arr[p1] == arr[p1 + 1]) {
                        p1++;
                    }
                    // while (p1 < p2 && arr[p2] == arr[p2 - 1]) {
                    //     p2--;
                    // }

                    int sum = arr[i] + arr[j] + arr[p1] + arr[p2];
                    if(sum == target){
                        System.out.print(arr[i]+" " + arr[j]+" " + arr[p1]+" " + arr[p2]);
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
}
