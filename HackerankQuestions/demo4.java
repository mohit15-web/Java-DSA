import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(fisrt(s));
    }
      public static char fisrt(String s){
    
    for (int i=0;i<s.length();i++) {
        if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
        return s.charAt(i);
    }
   
    return '_';


    }
        
}
