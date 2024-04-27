import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int original = sc.nextInt();
        while (true) {
            boolean found = false; 
            for (int i = 0; i < n; i++) {
                if (arr[i] == original) {
                    original *= 2; 
                    found = true;
                    break; 
                }
            }
            if(!found){
                break;
            }
        }
        System.out.println(original);
    }
}
