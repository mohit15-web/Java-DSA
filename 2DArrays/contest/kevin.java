package contest;

import java.util.Scanner;

public class kevin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
    }
    public static void game(String str,int n){
        int count1 =0;
        int count2 =0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '1'){
                count1++;
            }else{
                count2++;
            }
        }
        if(count1 == count2){
            System.out.println("WIN");
        }
        if(count1 > count2){
            System.out.println("WIN");
        }else{
            System.out.println("LOSE");
        }
    }
}
