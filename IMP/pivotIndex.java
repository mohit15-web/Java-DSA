//package IMP;

import java.util.Scanner;

public class pivotIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(pivot(arr,n));
  }
  public static int pivot(int[] arr,int n){
    int[] leftSum = new int[n];
    leftSum[0] = arr[0];
    for (int i = 1; i < leftSum.length; i++) {
        leftSum[i] = leftSum[i-1] + arr[i];
    }

    int[] rightSum = new int[n];
    rightSum[n-1] = arr[n-1];
    for (int i = n-2; i >= 0; i--) {
        rightSum[i] = rightSum[i+1] + arr[i];
    }

    for (int i = 0; i < arr.length; i++) {
        if(leftSum[i] == rightSum[i])
        return i;
    }
    return -1;
  }
}