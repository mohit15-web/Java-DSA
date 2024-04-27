import java.util.Scanner;

public class demo5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int slargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            } else if(arr[i] > slargest && arr[i] != largest ){
                slargest = arr[i];
            }
            
        }
        System.out.println(slargest);
    }
}
