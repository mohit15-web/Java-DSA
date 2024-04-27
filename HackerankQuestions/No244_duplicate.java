import java.util.Scanner;

public class No244_duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans  = check(arr);
        System.out.println(ans);

    }
    public static boolean check(int[] arr){

         for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                   return true;

            }

        }
    }
    return false;
}
}