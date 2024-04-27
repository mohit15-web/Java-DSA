import java.util.Arrays;
import java.util.Scanner;

public class slide2_sortByParity {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[]arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,(a,b) -> {
            if(a%2!=0 && b%2!=0){
                return a-b;
            }else if(a%2==0 && b%2==0){
                return a-b;
            }else if(a%2 !=0 && b%2 ==0){
                return 1;
            }else{
                return -1;
            }
            
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
