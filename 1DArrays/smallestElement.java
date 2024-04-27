import java.util.Scanner;

public class smallestElement {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(findSmallest(arr, n));

}
public static int findSmallest(int arr[], int n) {
    int smallest = arr[0];
    for(int i=0;i<n;i++){
        if(arr[i] < smallest){
            smallest= arr[i];
        }
    
    }
    return smallest;
    }

}

