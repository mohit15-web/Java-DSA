import java.io.*;
import java.util.*;

public class threeStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk1 = new Stack<>();
        int n1 = sc.nextInt();
        Stack<Integer> stk2 = new Stack<>();
        int n2 = sc.nextInt();
        Stack<Integer> stk3 = new Stack<>();
        int n3 = sc.nextInt();
        
        int sum1 = 0;
        for(int i=0;i<n1;i++)
        {
            int x = sc.nextInt();
            sum1 += x;
            stk1.add(x);
        }
        int sum2 = 0;
         for(int i=0;i<n2;i++)
        {
            int  y= sc.nextInt();
             sum2 += y;
            stk2.add(y);
        }
        int sum3 = 0;
         for(int i=0;i<n3;i++)
        {
            int z = sc.nextInt();
             sum3 += z;
            stk3.add(z);
        }
//         scanning completed
  
      Collections.reverse(stk1);
      Collections.reverse(stk2);
      Collections.reverse(stk3);
            
          
     while(true)
     {
         int minSum = Math.min(Math.min(sum1, sum2), sum3);
         if (sum1 == 0 || sum2 == 0 || sum3 == 0) {
              System.out.println("0");  
             return ;
            }
         if(sum1==sum2 && sum2==sum3)
         {
             System.out.println(sum1);
             return;
         }
         if(sum1 > minSum)
         {
             int a = stk1.pop();
             sum1 -= a;
            
         }
         if(sum2 > minSum)
         {
              int b = stk2.pop();
             sum2 -= b;
         
         }
         if(sum3 > minSum)
         {
              int c = stk3.pop();
             sum3 -= c;
         }
     }

    }
}