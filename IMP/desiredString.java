import java.util.Scanner;

public class desiredString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        desired(str);
    }
    public static void desired(String str){
        int n = str.length();
        int count =0;
        int len =0;
        String finalString = "";
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                String sub = str.substring(i, j+1);
                if(sub.charAt(0) == 'A' && sub.charAt(sub.length()-1) == 'A'){
                    count++;
                    if(len < sub.length()){
                        len = sub.length();
                        finalString = sub;
                    }
                }
            }
        }
        if(count != 0){
            System.out.println(count);
            System.out.println(len);
            System.out.println(finalString);
        }else{
            System.out.println("-1");
        }
    }
}
