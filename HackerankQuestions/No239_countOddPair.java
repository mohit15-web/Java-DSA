import java.util.Scanner;

public class No239_countOddPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = arr[i]+arr[j];
                if(sum %2==1){
                System.out.println(arr[i]+" "+arr[j]);

                }
            }
        }
        }

    }

