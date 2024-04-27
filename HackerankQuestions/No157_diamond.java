import java.util.Scanner;

public class No157_diamond {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int star =1;
        for (int i = 1; i <=(n*2)+1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i < n){
                space--;
                star +=2;
            }else{
                space++;
                star -=2;
            }

        }
    }
}
