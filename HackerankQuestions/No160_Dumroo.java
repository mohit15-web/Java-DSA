import java.util.Scanner;

public class No160_Dumroo {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        int star =n;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if(i < n / 2+1){
                space++;
                star -=2;
            }else{
                space--;
                star +=2;
            }

        }
    }
}
