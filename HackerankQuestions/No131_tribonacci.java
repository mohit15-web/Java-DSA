import java.util.Scanner;

public class No131_tribonacci {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }
    public static void fibo(int n){
        int i=0;
       int a = 0;
       int b =1;
       int c=1;
       while(i < n){
        int d = a+b+c;
        a = b;
        b =c;
        c =d;
        i++;
       }
      System.out.print(a+" ");


    }
}
