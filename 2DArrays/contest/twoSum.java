import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        sum(arr,n,target);
    }
    public static void sum(int[] arr,int n,int target){
        Arrays.sort(arr);
        int p1=0;
        int p2=n-1;

        while(p1 < p2){
            int sum = arr[p1] + arr[p2];
            if(sum == target){
                System.out.print(arr[p1]+" "+arr[p2]);

                while(p1 < p2 && arr[p1] == arr[p1 + 1]){
                    p1++;
                }
                while(p1 < p2 && arr[p2] == arr[p2 - 1]){
                    p2--;
                }

                p1++;
                p2--;
            }else if(sum < target){
                p1++;
            }else{
                p2++;
            }
        }
    }
}
