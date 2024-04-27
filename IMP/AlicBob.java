import java.util.Scanner;

public class AlicBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int capacityA  = sc.nextInt();
        int capacityB  = sc.nextInt();

        System.out.println(plantWater(arr,n,capacityA,capacityB));
    }
    public static int plantWater(int[] arr,int n,int capacityA,int capacityB){
        int refill = capacityA;
        int count = 0;
        int i=0;
        int j=n-1;
        while(i <= j){
            if(i == j){
                if(capacityA == capacityB){
                    if(capacityA < arr[i]){
                        capacityA = refill;
                        count++;
                    }
                }else{
                    if(capacityA > capacityB){
                        if(capacityA < arr[i]){
                        capacityA = refill;
                        count++;
                       }
                    }else{
                        if(capacityB < arr[j]){
                        capacityB = refill;
                        count++;
                       }
                    }
                }
                break;
            }

            if(capacityA < arr[i]){
                capacityA = refill;
                count++;
            }
            if(capacityB < arr[j]){
                capacityB = refill;
                count++;
            }

            capacityA -= arr[i];
            capacityB -= arr[j];

            i++;
            j--;
        }
        return count;
    }
}
