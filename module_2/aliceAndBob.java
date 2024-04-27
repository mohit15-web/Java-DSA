import java.util.Scanner;

public class aliceAndBob {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int capacityA = sc.nextInt();
        int capacityB = sc.nextInt();
        System.out.println(addNum(arr,n,capacityA,capacityB));;
    }
    public static int addNum(int[] arr,int n,int capacityA,int capacityB){
        int refill = capacityA;
        int refill2 = capacityB;
        int i=0;
        int j=n-1;
        int count =0;
        while(i < j){
            if(capacityA >= arr[i] && capacityB >= arr[j]){
                capacityA -= arr[i];
                capacityB -= arr[j];
                j--;
                i++;
            }else if(capacityA >= arr[i] && capacityB < arr[j]){
                capacityA -= arr[i];
                i++;
                capacityB += refill2;
                count++;

            }else if(capacityA < arr[i] && capacityB >= arr[j]){
                capacityB -= arr[j];
                j--;
                capacityA += refill;
                count++;

            }
        }
        return count;
    }
}
