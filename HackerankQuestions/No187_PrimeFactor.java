import java.util.Scanner;

public class No187_PrimeFactor {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int j = 1; j < num; j++) {
            if(num%j==0 && isPrime(j)){
                System.out.println(j);
            }
        }
    }
    public static boolean isPrime(int j){
        if(j == 1){
            return false;
        }
        

        for (int i = 2; i < j; i++) {
         
            if(j%i==0){
                return false;
            }
        
        }
        return true;

    }
}

