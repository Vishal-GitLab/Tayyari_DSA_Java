package If_Else;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n  = input.nextInt();

        System.out.println((n%2  == 0) ? " Even" : "Odd");
    }
}
