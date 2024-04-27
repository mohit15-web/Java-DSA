import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class nextGreater {
 public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        nextGrater(arr,n);
    }
    public static void nextGrater(int[] arr,int n){
        ArrayList<Integer> ans = new ArrayList<>();
        
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(!st.isEmpty()){
            while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans.add(-1);
                st.push(arr[i]);
            }else{
                ans.add(st.peek());
                st.push(arr[i]);
            }
        }else{
            ans.add(-1);
            st.push(arr[i]);
        }
      }

      for (int val : ans) {
        System.out.print(val+" ");
      }
        
    }
}
