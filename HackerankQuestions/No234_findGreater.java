
import java.util.Scanner;

public class No234_findGreater {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
   for (int i = 0; i < arr.length; i++) {
     int count = 0;
     for (int j = 0; j < arr.length; j++) {
        if(arr[j] > arr[i]){
            count++;
        }
     }
     System.out.print(count+" ");

   }
 }
}