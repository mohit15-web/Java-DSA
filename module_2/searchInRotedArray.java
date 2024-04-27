import java.util.Scanner;

public class searchInRotedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(search(arr, n, target));
    }
    public static int search(int[] arr,int n,int target){
        int left = 0;
        int right = n-1;
        while (left <= right) {
            int mid = (left + right)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > arr[right]){
                left = mid + 1;
            }else{
                right = mid - 1;

            }
        }
        return -1;
    }
}
