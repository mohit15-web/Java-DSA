import java.util.Scanner;

public class No227_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = solve(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] solve(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                arr[i]++;
            } else if(arr[i] == 0){
                arr[i] +=2;
            } else if(arr[i] < 0){
                arr[i] +=3;
            }

        }
return arr;
    }
}
