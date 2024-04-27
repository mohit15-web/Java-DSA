import java.util.Scanner;

public class No222_removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int num =  sc.nextInt();
        System.out.println(remove(arr, num));
    }
   public static int remove(int[] arr,int num){
    int count=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] != num){
            arr[count] = arr[i];
            count++;
        }
    }
    return count;
   }
    
}
