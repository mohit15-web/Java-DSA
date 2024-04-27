import java.util.Scanner;

public class newCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(find(n,arr));
    }
    public static int find(int n , int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        int min = arr[i];
            for (int j = 0; j < i; j++) {
                if(arr[j] != min){
                    min = Math.min(min, arr[j]);
                }
                sum += min;

            }
        }
        return sum;
    }
}