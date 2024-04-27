import java.util.Scanner;

public class No230_updateWithK {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i< n;i++) {
            if(arr[i]%2==0 && arr[i]>k){
                arr[i] /= 2;
            } else if(arr[i]%2==1 && arr[i]>k){
                arr[i] += k;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
