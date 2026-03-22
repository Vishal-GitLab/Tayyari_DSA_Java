package Recursion;

import java.util.Scanner;

public class OneToN {
    static   int n;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         n = input.nextInt();       // int dec. nahi karenge
       // print(1);                       // do para meter ka use karenge
        //  ajay(1);
        print(n);
    }
    public static void print(int n) {
        if (n==0) return;
        System.out.print(n + " ");            // for increasing  and decreasing
        print(n-1);
       if (n!=1)    System.out.print(n + " ");      // this is a another  method
    }
//    public static void print(int x) {
//        if (x>n) return;
//        System.out.println(x + " ");
//        print(x+1);
//        }
//    public static void print(int x, int n ) {
//        if (x>n) return;
//        System.out.println(x);
//        print(x+1, n);
//    }
}
