//package IMP;

import java.util.Scanner;

public class maxProduct {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(maximumProduct(arr,n));
  }
  public static int maximumProduct(int[] arr,int n){
    int maxSf =1;
    int minSf =1;
    int result =0;
    for (int i = 0; i < arr.length; i++) {
        int temp = maxSf;
        maxSf = Math.max(arr[i], Math.max(maxSf*arr[i],minSf*arr[i]));
        minSf = Math.min(arr[i], Math.min(minSf*arr[i], temp*arr[i]));
        result = Math.max(maxSf, result);
    }
    return result;
  }
}
