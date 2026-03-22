package Recursion;

import java.util.Scanner;

public class MultipleLinear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  a  = input.nextInt();
        System.out.print("Enter Exponent: ");
        int  b = input.nextInt();
        System.out.println(a + " raised to the " + b + " is : " + pow(a,b));
      }


    public   static  int  pow(int a, int b) {
        if (b == 0) return 1;
        int call = pow(a,b/2);
        if (b%2 == 0) return call*call;
        else return a*call*call;

    }
//     public   static  int  pow(int a, int b) {
//        if(b==0) return 1;
//        return a*pow(a,b-1);
//     }
}
