import java.util.Scanner;

public class No236_greatestDiff {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
       for (int j = i+1; j < arr.length; j++) {
         int diff = arr[j] - arr[i];
        if(diff > max){
            max = diff;
        }
       }
    }
    System.out.println(max);
   }
 }


