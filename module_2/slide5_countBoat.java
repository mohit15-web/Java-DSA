import java.util.Scanner;

public class slide5_countBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int limit = sc.nextInt();
        countBoats(arr,n,limit);
    }
    public static void countBoats(int[] arr,int n,int limit){
        int i=0;
        int j=n-1;
        int count =0;
        while(i <= j){
            int sum = arr[i]+arr[j];
            if(sum > limit){
                j--;
            }else if(sum == limit){
                i++;
                j--;
            }
            count++;
        }
        System.out.println(count);
   }
}
