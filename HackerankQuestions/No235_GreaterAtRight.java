
import java.util.Scanner;

public class No235_GreaterAtRight {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
   for (int i = 0; i < arr.length; i++) {
     int count = 0;
     for (int j = i+1; j < arr.length; j++) {
        if(arr[j] > arr[i]){
            count++;
        }
     }
     System.out.print(count+" ");

   }
 }
}