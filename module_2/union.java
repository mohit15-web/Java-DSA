import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                ans.add(arr1[i]);
                i++;
            }else if(arr1[i] > arr2[j]){
                ans.add(arr2[j]);
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

            while(i < n){
                ans.add(arr1[i]);
                i++;
            }

            while(j < m){
                ans.add(arr2[j]);
                j++;
            }
            // int idx = 0;
            // while (idx < ans.size()-1) {
            //     if (ans.get(idx) == ans.get(idx + 1)) {
            //         ans.remove(idx);
            //     }
            //     idx++;
            // }

            for (Integer integer : ans) {
                System.out.print(integer+" ");
            }
        
    }
}
