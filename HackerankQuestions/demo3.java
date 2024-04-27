import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int num : nums) {
            smallest = Math.min(smallest, num);
            largest = Math.max(largest,num);
        }
        int ans = 0;
        for (int i = 1; i <= largest; i++) {
            if(smallest%i == 0 && largest%i== 0){
                    ans = i;
            }
        }
        System.out.println(ans);
    }
}
   
