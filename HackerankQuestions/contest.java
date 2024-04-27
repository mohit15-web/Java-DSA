import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int repeatingNumber = findRepeating(arr, n);
        int missingNumber = findMissing(arr, n);
        
        System.out.println("Repeating number: " + repeatingNumber);
        System.out.println("Missing number: " + missingNumber);
    }

    public static int findRepeating(int[] arr, int n) {
        boolean[] seen = new boolean[n + 1];
        for (int num : arr) {
            if (seen[num]) {
                return num;
            }
            seen[num] = true;
        }
        return -1;
    }

    public static int findMissing(int[] arr, int n) {
        boolean[] seen = new boolean[n + 1];
        for (int num : arr) {
            seen[num] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                return i;
            }
        }
        return -1;
    }

}
