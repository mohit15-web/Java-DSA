import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candy = new int[n];
        for (int i = 0; i < candy.length; i++) {
            candy[i] = sc.nextInt();
        }
        int extraCandy = sc.nextInt();
        int maxcandy = -1;

        for (int i = 0; i < candy.length; i++) {
            if(candy[i] > maxcandy){
                maxcandy = candy[i];
            }
        }
        boolean[] result = new boolean[n];
        for (int i = 0; i < result.length; i++) {
            if(candy[i] + extraCandy >= maxcandy){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
