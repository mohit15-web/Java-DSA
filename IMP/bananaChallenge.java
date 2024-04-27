import java.util.Scanner;

public class bananaChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int hours = sc.nextInt();

        int si = 1;
        int ei= (int)1e9;
        int ans=0;

        while(si <= ei){
            int mid = (si + ei)/2;
            if(check(mid,arr,hours) == true){
                ei = mid - 1;
                ans = mid;
            }else{
                si = mid + 1;
            }
        }
        System.out.println(ans);
    }
    private static boolean check(int speed, int[] arr, int hours) {
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            time += (arr[i]/speed);
            if(arr[i] % speed != 0){
                time++;
            }
        }

        return time <= hours;
    }
}
