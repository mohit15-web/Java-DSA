import java.util.Scanner;

public class No185_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

        for (int j = 0; j < n; j++) {
            
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= x; i++) {
            if(x%i == 0 && y%i== 0){
                    ans = i;
            }
        }
        System.out.println(ans);
    }
}
}
