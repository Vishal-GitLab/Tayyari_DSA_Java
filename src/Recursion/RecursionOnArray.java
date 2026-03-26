package Recursion;

import javax.swing.*;

public class RecursionOnArray {
    public static void main(String[] args) {
        int[]  arr = {12,43,53,45,23};
       // printRec(arr,0);
        int target  = 73;
        System.out.print(exists(arr,target,0));

    }
    public  static boolean exists(int[] arr,int target, int idx) {
        if (idx== arr.length) return false;
        if (arr[idx] == target)  return true;
        return exists(arr, target, idx+1);
    }
    public static void  printRec(int[] arr, int idx) {
//        int n = arr.length;
//        if (idx == n)  return;

        // for the numebr reverse print ke liye
        if (idx== arr.length) return;
        printRec(arr,idx+1);
        // call ke bad kam karne se chize badal jati hai
     //   System.out.print(arr[idx]+ " ");
    }
}
