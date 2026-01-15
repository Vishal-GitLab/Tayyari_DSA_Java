package Loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        if (n==0)  n= 7;   //  n= koi digit likh sakte hai 9 tak
        int count  = 0;
        while(n != 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
    }

