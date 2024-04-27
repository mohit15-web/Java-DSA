import java.util.Scanner;

public class No181_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
    public static boolean isPalindrome(int n){
        int check = n;//121
        int ans=0;
        while(n>0){
            int rem = n%10;
            ans = (ans *10)+rem;
            n /=10;
        }
        if(ans == check){
            return true;
        }
    return false;
    }
}
