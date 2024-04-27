import java.util.Arrays;
import java.util.Scanner;

public class slide3_sortByParity {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[]arr = new int[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
          }
          sortArray(arr,n);
    }

    public static void sortArray(int[] arr, int n) {
        int[] odd = new int[n/2];
        int[] even = new int[n/2];
        int p1=0,p2=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                even[p1] = arr[i];
                p1++;
            }else{
                odd[p2] = arr[i];
                p2++;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        p1=0;
        for (int i = 0; i < n; i+=2) {
            arr[i] = even[p1];
            p1++;
        }
        p2=0;
        for (int i = 1; i < n; i+=2) {
            arr[i] = odd[p2];
            p2++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
