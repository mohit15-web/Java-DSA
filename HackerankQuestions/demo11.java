
import java.util.*;

public class demo11 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }
    // System.out.println(missing(arr,n));
      int sum=0;
        for(int i=0;i<n;i++)
        {
              sum+=arr[i];
        }
        System.out.println(sum);
         int lsum=0;
        for(int i=0;i<n;i++)
        {
              lsum+=arr[i];
        }
        System.out.println(lsum);
     
    }
    public static int missing(int[] nums,int n){
     
        int sum=0;
        for(int i=0;i<n;i++)
        {
              sum+=nums[i];
        }
        
       int lsum=0;
        for(int i=0;i<n;i++)
        {
            lsum+=nums[i];
            if(sum-lsum==lsum-nums[i]){
                return i;
            }
        }

        return -1;
        
    }
  }

