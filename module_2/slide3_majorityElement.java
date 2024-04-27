import java.util.Scanner;

public class slide3_majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          Integer[]arr = new Integer[n];
          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
          }
          int check = (int)Math.ceil(n/2);
          for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                count++;
            }
            if(count == check){
                System.out.println(arr[i]);
                break;
            }else{
                System.out.println("NO MAJORITY ELEMENT");
                break;
            }
          }
    }
}
