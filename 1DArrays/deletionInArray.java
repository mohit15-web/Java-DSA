import java.util.Scanner;

public class deletionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity =10;
        int[] arr =new int[capacity];
        System.out.println("enter size of array");
        int n =sc.nextInt();
        System.out.println("enter the elements of array");
        for (int i = 0; i <n ; i++) {
            arr[i] =sc.nextInt();
        }
        System.out.println("array before deletion of number");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]+" ");
        }
        //Deletion
        System.out.println("enter index or position you want to delete");
        int pos = sc.nextInt();
        //shifting the elements
        for (int i = pos; i <n ; i++) {
            arr[i] =arr[i-1];
        }
        n--;
        System.out.println("array after deletion");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]+" ");
            
        }
    }
}
