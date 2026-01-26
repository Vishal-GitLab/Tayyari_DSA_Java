package Pattern_Printing;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        int mid = n / 2 + 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==mid || j==mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
