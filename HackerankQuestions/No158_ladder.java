import java.util.Scanner;

public class No158_ladder {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
           for (int j = 1; j <=m; j++) {
             if(i%3==1 || j==1 || j==m){
                System.out.print("* ");
             }else{
                System.out.print(" ");
             }
           }
            System.out.println();
        }
      }
}
