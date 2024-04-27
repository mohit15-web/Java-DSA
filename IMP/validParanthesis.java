import java.util.Scanner;
import java.util.Stack;

public class validParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(valid(str));
    }
    public static boolean valid(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(!st.isEmpty() && ch == ')' && st.peek() == '('){
                st.pop();
            } else if(!st.isEmpty() && ch == '}' && st.peek() == '{'){
                st.pop();
            } else if(!st.isEmpty() && ch == ']' && st.peek() == '['){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        return st.size() == 0;
    }
}
