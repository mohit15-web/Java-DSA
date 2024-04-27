import java.util.Scanner;

public class dem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] finalResult = isPresent(arr1, arr2);
        for (int i = 0; i < finalResult.length; i++) {
            System.out.print(finalResult[i]+" ");
        }
    }
    public static int[] isPresent(int[] arr1,int[] arr2){
        int n = arr1.length;
        int[] res = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i] == arr2[i]){
                res[i] = arr1[i];
            }
        }
        return res;
    }
}
