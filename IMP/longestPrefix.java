import java.util.Scanner;

public class longestPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        String str[] = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }

        System.out.println(prefix(str));
    }
    public static String prefix(String[] str){
        String ans = "";
        for (int i = 0; i < str[0].length(); i++) {
            char ch = str[0].charAt(i);

            boolean match = true;
            for (int j = 1; j < str.length; j++) {
                if(str[j].length() < i || ch != str[j].charAt(i)){
                    match = false;
                    break;
                }
            }
            if(match == false){
                break;
            }else{
                ans += ch;
            }
        }
        return ans;
    }
}
