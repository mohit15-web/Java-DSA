import java.util.Scanner;

public class No189_divisible {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            
       int step = sc.nextInt();
            while(num%2==0 || num%3==0 || num%5==0){
                if(num%2==0){
                    num /=2;
                    step +=2;

                } else if(num%3==0){
                    num /=3;
                    step +=3;
                }else if(num%5==0){
                     num /=5;
                     step +=5;
                }
            
            }
            System.out.println(step);

            System.out.println(num);
        }
}

