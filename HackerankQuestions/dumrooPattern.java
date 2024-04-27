import java.util.Scanner;

public class dumrooPattern {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space =0;
        int star = n;
        for (int i = 1; i <=n; i++) {
          for (int j = 1; j <= space; j++) {
            System.out.print(" ");
          }
          for (int j = 1; j <= star; j++) {
            System.out.print("*");
          }
          if(i < (n/2)+1){
            space++;
            star-=2;
          }else{
            space--;
            star+=2;
          }
            
            System.out.println();

        }
       

    }
    // public static int steps(int[] numbers){
    //     int max = -100;
    //     int steps =0;
    //     for (int i = 0; i < numbers.length; i++) {
    //         if(numbers[i] > max){
    //             max = numbers[i];
    //             steps++;
    //         }
    //     }
    //     return steps;
    // }
}
