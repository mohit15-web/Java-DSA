
import java.util.Scanner;

public class distBetTwoChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        
        System.out.println(findDist(str,a,b));
        
    }
    public static int findDist(String str,char a,char b){
       int n = str.length();
       int p1=0;
       int p2=0;
       while(p1 < n && str.charAt(p1) != a){
        p1++;
       }

       while(p2 < n && str.charAt(p2) != b){
        p2++;
       }

       int dist = Integer.MAX_VALUE;

       while(p1 < n && p2 < n){
        dist = Math.min(dist, Math.abs(p1 - p2) - 1);

        if(p1 < p2){
            p1++;
            while(p1 < n && str.charAt(p1) != a){
              p1++;
            }
        }else{
            p2++;
            while(p2 < n && str.charAt(p2) != b){
              p2++;
            }
        }
       }
       return dist;
    }
}
//15
//22