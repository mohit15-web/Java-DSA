import java.util.Scanner;

public class slide3_productSubarray {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[]arr = new int[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
          }
          System.out.println(findProduct(arr, n));
    }
    public static int findProduct(int[] arr,int n){
        int maxSf=1;
        int minSf=1;
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                maxSf = Math.max(maxSf, maxSf*arr[i]);
                minSf = Math.min(minSf*arr[i], 1);
            }else if(arr[i] == 0){
                maxSf =1;
                minSf =1;
            }else{
                int temp = maxSf;
                maxSf = Math.max(minSf*arr[i],1);
                minSf = temp = arr[i];
            }
            result = Math.max(maxSf,result);
        }
        return result;
    }
}
