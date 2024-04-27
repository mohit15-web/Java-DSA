import java.util.Scanner;

public class mergeTwoSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        merge(nums1, m, nums2, n);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=0,p2=0,p3=0;
        int res[] = new int[m+n];
        while(p1 < m && p2 < n){
            if(nums1[p1] < nums2[p2]){
                res[p3] = nums1[p1];
                p1++;p3++;
            }else{
                res[p3] = nums2[p2];
                p2++;p3++;
            }
        }
        while(p1 < m){
            res[p3] = nums1[p1];
                p1++;p3++; 
        }
        while(p2 < n){
            res[p3] = nums2[p2];
                p2++;p3++; 
        }
        for(int i=0;i<res.length;i++){
            if(res[i] != 0)
                nums1[i] = res[i];
        }
    }
}
