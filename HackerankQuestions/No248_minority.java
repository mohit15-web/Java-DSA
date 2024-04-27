import java.util.Scanner;

public class No248_minority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int minElement = -1;
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            int currentCount =0;

            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    currentCount++;
                }
            }
            if(currentCount <= minCount){
                minCount = currentCount;
                minElement = currentElement;
            }
        }
        System.out.println(minElement);
        
    }
}
