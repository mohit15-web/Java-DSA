import java.util.Scanner;

public class kFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        frequent(arr,n,k);
    }
    public static void frequent(int[] arr,int n,int k){
        int[] freq = new int[10];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < k; i++) {
            int temp = 0, idx = -1;
            for (int j = 0; j < freq.length; j++) {
                if(freq[j] >= temp){
                    temp = freq[j];
                    idx = j;
                }
            }
            System.out.print(idx+" ");
            freq[idx] = 0;
        }
    }
}
