import java.util.Scanner;

public class No245_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr2.length; j++) {
                if(arr[i] == arr2[j])
                count++;

            }
            int count2 = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    count2++;
                }
            }

            if (count == 2 && count2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
