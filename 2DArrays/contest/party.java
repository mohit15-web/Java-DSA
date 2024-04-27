
import java.util.Scanner;

public class party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String ans = str.replaceAll("party", "pawri");
        System.out.println(ans);
    }
}
