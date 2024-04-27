import java.util.Arrays;
import java.util.Scanner;

public class slide2_thirdMaximum {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        int thirdMax = arr[n-1];
        int count =1;
        for(int i = n-2;i>=0;i--){
            if(arr[i] != thirdMax){
                thirdMax = arr[i];
                count++;
            }

            if(count == 3)
                break;
        }
        if(count >= 3){
            System.out.println(thirdMax);
        }else{
            System.out.println(arr[n-1]);
        }

    }
}
