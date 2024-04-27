import java.util.Scanner;

public class No241_differnce {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr1[] = new int[n];

      for (int i = 0; i < arr1.length; i++) {
          arr1[i] = sc.nextInt();
      }
      int target = sc.nextInt();
      int ans[] = new int[n];

      for(int i=arr1.length-1;i>=0;i--){
        int sum = arr1[i] + target;
        int finalResult = sum%10;
        ans[i] = finalResult;
        target = sum / 10;
      }
      if(target != 0){
        System.out.print(target+" ");
      }

      for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i]+" ");
      }
    }
}
