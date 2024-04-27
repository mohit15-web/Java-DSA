import java.util.Scanner;

public class No183_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            if(armStrong(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean armStrong(int x){
        if(x <=9){
            return true;
        }
        int arm = 0;
        int c = x;
        while(x > 0){
            int rem = x%10;
            arm = (rem*rem*rem)+arm;
            x /=10;
        }
         return arm == c;
    }
}
