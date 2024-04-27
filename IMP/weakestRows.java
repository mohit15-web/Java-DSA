import java.util.PriorityQueue;
import java.util.Scanner;

public class weakestRows {
    public static void main(String[] args) {
        Scanner sc new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        PriorityQueue<int[]> que = new PriorityQueue<>((a,b) -> {
            if(a[1] != b[1]){
                return a[1] - b[1];
            }else{
                return a[0] - b[0];
            }
        });

        for (int j = 0; j < arr.length; j++) {
            int solder = find(arr[i]);
            int top[] = new int[n];
            top[0] = i;
            top[1] = solder;
            que.add(top);
        }

        while (que.size() > 0) {
            int temp[] = que.poll();
            System.out.println(temp[0]);
        }
    }
    public static int find(int[] arr){
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei)/2;
            if(arr[mid] == 1){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
        return si;
    }
}
