import java.util.Scanner;

public class productOfItself {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
           
        int[] ans = findProduct(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
      public static int[] findProduct(int[] nums) {
            int n = nums.length;
            int[] left = new int[n];
            int[] right = new int[n];
            int[] ans = new int[n];


            left[0] = 1;
            for (int i = 1; i < left.length; i++) {
                left[i] = left[i-1]*nums[i-1];
            }

            
            right[n-1] = 1;
            for (int i = n-2; i >=0; i--) {
                right[i] = right[i+1]*nums[i+1];
            }

       
            for (int i = 0; i < n; i++) {
                ans[i] = left[i] * right[i];
            }
            return ans;
    }
}
