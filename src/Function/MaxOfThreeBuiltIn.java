package Function;

import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
