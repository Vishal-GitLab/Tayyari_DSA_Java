package Recursion;

import java.util.Scanner;

public class CallingItSelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(n);
      //  ajay(1);
    }
    public static void print(int n ) {
        if (n == 0) return;
        System.out.println(n);
        print(n-1);
    }
}
