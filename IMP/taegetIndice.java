import java.util.Arrays;
import java.util.Scanner;

public class taegetIndice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    find(arr,n,k);
    }
    public static void find(int[] arr,int n,int k){
        int upper = BSUB(arr,n,k);
        int lower = BSLB(arr,n,k);

        if (upper != -1 && lower != -1) {
            for(int i=lower;i<=upper;i++){
                System.out.print(i+" ");
            }
        }else{
                System.out.print("-1");
            }
     }
        
    public static int BSUB(int[] arr,int n,int k){
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        while (i <= j) {
            int mid = (i + j)/2;
            if(arr[mid] == k){
                if(mid < n - 1 && arr[mid] == arr[mid + 1]){
                i = mid + 1;
            }else{
                return mid;
            }
         }else if(arr[mid] < k){
            i = mid + 1;
         }else{
            j = mid - 1;
         }
        }
        return -1;
    }
     public static int BSLB(int[] arr,int n,int k){
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        while (i <= j) {
            int mid = (i + j)/2;
            if(arr[mid] == k){
                if(mid - 1 > 0 && arr[mid] == arr[mid - 1]){
                j = mid - 1;
            }else{
                return mid;
            }
         }else if(arr[mid] < k){
            i = mid + 1;
         }else{
            j = mid - 1;
         }
        }
        return -1;
    }
}
