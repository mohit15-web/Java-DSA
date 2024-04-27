import java.util.Scanner;

public class No116_printFibonacci {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // fibo(n);
       System.out.println(fibo(n));
    }
    public static int fibo(int n){
        int i=0;
       int a = 0;
       int b =1;
       while(i < n){
        int c = a+b;
        a = b;
        b =c;
        i++;
    

       }
return a;
    }
}
