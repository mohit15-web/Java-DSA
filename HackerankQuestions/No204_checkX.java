import java.util.Scanner;

public class No204_checkX{
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.println("enter element you want to");
      int x= sc.nextInt();
      System.out.println(check(arr, x));

    }
    public static String check(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x)
            return "True";
        }
        return "False";
    }
}