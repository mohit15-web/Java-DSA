import java.util.Scanner;

public class firstUniquecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(fisrt(s));
    }
      public static int fisrt(String s){
    
    for (int i=0;i<s.length();i++) {
        if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
        return i;
    }
   
    return -1;

   }
//     public static int fisrt(String s){
//     int[] char_count = new int[26];
//     for (int i=0;i<s.length();i++) {
//         char_count[s.charAt(i)- 'a']++;
//     }
//    for (int i=0;i<s.length();i++) {
//        if(char_count[s.charAt(i)- 'a'] == 1)
//               return i;
//     }
//     return -1;


//     }
}