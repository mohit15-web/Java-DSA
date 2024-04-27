import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class asteroidCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = collide(arr, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] collide(int[] arr,int n){
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                st.push(arr[i]);
            }else{
                while(st.size() > 0 && st.peek() > 0 && st.peek() < -1 * arr[i]){
                    st.pop();
                }

                if(!st.isEmpty() && st.peek() == -1 * arr[i]){
                    st.pop();
                }else if(st.isEmpty() || st.peek() < 0){
                    st.push(arr[i]);
                }
            }
        }

        Collections.reverse(st);
        int size = st.size();
        int[] ans = new int[size];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
