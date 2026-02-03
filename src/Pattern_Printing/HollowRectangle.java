package Pattern_Printing;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i ==1 || i ==m || j ==1 || j == n)
                    System.out.print("* ");
                else System.out.print("  ");
                }
            System.out.println();
            }
        }
    }

