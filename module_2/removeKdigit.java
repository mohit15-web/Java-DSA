import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class removeKdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();

        System.out.println(remove(str,k));
    }
    public static String remove(String str,int k){

        Stack<Character> st = new Stack<>();
        char n = '0';
        for (int i = 0; i < str.length(); i++) {
            n = str.charAt(i);
            while (k > 0 && !st.isEmpty() && st.peek() > n) {
                st.pop();
                k--;
            }
            st.push(n);
        }

        while (k-- > 0) {
            st.pop();
        }
        StringBuilder finalString = new StringBuilder();
        while (st.size() > 0) {
            finalString.insert(0, st.pop());
        }
         return finalString.toString();
    }
}
