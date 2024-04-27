import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        frequent(arr,n,k);
    }
    public static void frequent(int[] arr,int n,int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        PriorityQueue<int[]> que = new PriorityQueue<>((a,b) -> {
            if(a[1] != b[1]){
                return b[1] - a[1];
            }else{
                return b[0] - a[0];
            }
        });

        for (int x : map.keySet()) {
            int top[] = new int[n];
            top[0] = x;
            top[1] = map.get(x);
            que.add(top);
        }

        while (k -- > 0) {
            int[] x = que.poll();
            System.out.print(x[0]+" ");
        }
    }
   public static void main(Str)
}
