import java.util.*;

public class slide2_margetwoAraay {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        int m = sc.nextInt();
        int[]arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] =sc.nextInt();
        }
        mergeArray(arr,n,arr2,m);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
         for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        
    }
    public static void mergeArray(int[] arr,int n,int[] arr2,int m){
        int left = n-1;
        int right = 0;
        while (left >=0 && right < m) {
            if(arr[left] > arr2[right]){
                int temp = arr[left];
                arr[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }else{
                break;
            }
            
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        
    }
   
}
