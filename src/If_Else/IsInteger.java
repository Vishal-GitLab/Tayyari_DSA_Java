package If_Else;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        double n  = input.nextDouble();
    // ak real number integer ke andar store nahi hota hai double ke andar store hota hai.

        int x = (int)n;
        if (n-x > 0) System.out.println("Not an Integer");
        else System.out.println("IS an integer");

    }
}
