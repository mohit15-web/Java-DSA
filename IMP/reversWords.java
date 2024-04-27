import java.util.Scanner;

public class reversWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }
    public static void reverse(String str){
        String[] ans = str.split(" ");
        for (int i = 0; i < ans.length; i++) {
            ans[i] = reversword(ans[i]);
        }

        String finalRes = "";
        for (int i = 0; i < ans.length; i++) {
            finalRes += ans[i] + " ";
        }

        System.out.println(finalRes);
    }
    public static String reversword(String word) {
        String ans = "";
        for(int i=word.length()-1;i>=0;i--){
            ans += word.charAt(i);
        }
        return ans;
    }
}
