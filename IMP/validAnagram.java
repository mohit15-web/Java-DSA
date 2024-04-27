//package IMP;

import java.util.Scanner;

public class validAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(anagram(str1,str2));
    }
    public static boolean anagram(String str1,String str2){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq1[ch - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq2[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if(freq1[i] != freq2[i])
            return false;
        }

        return true;  
    }
}
