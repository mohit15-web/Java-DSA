import java.util.Scanner;

public class count0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(count(str));;
    }

    public static int count(String str) {
        int n = str.length();
        int ans =0;
        int idx =0;
        while(idx < n){
            int zero =0;
            while(idx < n && str.charAt(idx) == '0'){
                zero++;
                idx++;
            }
            int one =0;
            while(idx < n && str.charAt(idx) == '1'){
                one++;
                idx++;
            }

            ans += Math.min(zero, one);
        }

        idx =0;
        while(idx < n){
            int one =0;
            while(idx < n && str.charAt(idx) == '1'){
                one++;
                idx++;
            }
            int zero =0;
            while(idx < n && str.charAt(idx) == '0'){
                zero++;
                idx++;
            }

            ans += Math.min(zero, one);
        }
        return ans;
    }
}
