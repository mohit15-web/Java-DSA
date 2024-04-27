

import java.util.Scanner;

public class No182_Tranform {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int rem = n %100;
        int remain = n/100;
        System.out.print(rem);
        System.out.print(remain);
    }
    
}
