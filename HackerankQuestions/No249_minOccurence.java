import java.util.Scanner;

public class No249_minOccurence {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int miniElement = -1;
        int miniCount =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            int currentCount =0;


            
            for (int j = arr.length-1;j>=0;j--) {
                if(arr[i] == arr[j]){
                    currentCount++;
                }
            }
            if(currentCount < miniCount){
                miniCount = currentCount;
                miniElement = currentElement;

            }
        }
        System.out.println(miniElement);
    }
}
