package contest;

import java.util.Scanner;

public class prefixString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = str.length();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        
    }
    public static String check(String[] str,int n){
        String ans = "";
        for (int i = 0; i < str.length; i++) {
            String current = str[i];
            String firstSub = str.substring(current);
            for (int j = i; j < str.length; j++) {
                String sub = str.substring(;
                if(first == str.charAt(str[0])){
                    ans = first;
                }
            }
        }
    }
}
