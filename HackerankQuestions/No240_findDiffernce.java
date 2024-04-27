import java.util.Scanner;

public class No240_findDiffernce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int diff = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int res = arr[i] - arr[j] ;
                int finalres = Math.abs(res); 
                if(finalres== diff){
                System.out.println(arr[i]+" "+arr[j]);

                }
            }
        }
        }
}
