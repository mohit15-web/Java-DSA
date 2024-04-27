import java.util.Scanner;

public class No190_printPrime {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
      int i,j;
        for ( i = x; i <=y; i++) {
            for ( j = 2; j <= i; j++) {
                if(i%j==0)
                break;

            }
              if(i == j)
                System.out.println(j+" ");
        }
    }

}
