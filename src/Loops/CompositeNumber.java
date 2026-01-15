package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        boolean flag =  true;    // ture means prime
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i== 0) {    // 'i' to 'n' ka ak factor nikla
                flag = false;   // 1 is composite
                break;
            }
            }
        if (n==1) System.out.println( "Neither Prime nor Composite");
        else if (!flag) {
            System.out.println("Composite Number");
        }
        else System.out.println("Prime number");
    }
}

