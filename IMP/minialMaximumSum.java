import java.util.Scanner;

public class minialMaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int start = max(arr,n);
        int end = sum(arr,n);
        int ans = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(check(arr,mid,k) == true){
                ans = mid;
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(ans);
       
    }
    public static boolean check(int[] arr,int mid,int k){
        int subArray = 1;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if( sum > mid){
                subArray++;
                sum = arr[i];
            }
        }
        return subArray <= k;
    }
    public static int max(int[] arr,int n){
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int sum(int[] arr,int n){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
