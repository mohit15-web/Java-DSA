import java.util.Scanner;

public class No186_checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
             int num = sc.nextInt();
              isPrime(num);
        }
       
    }
    public static void isPrime(int num){
        if(num == 1){
            System.out.println("not prime");
            return;
        }
    
        for (int i = 2; i < num; i++) {
         
            if(num%i==0){
                System.out.println("not prime");
                return;
            }
        
        }
        System.out.println("prime");
        return;

    }
}
