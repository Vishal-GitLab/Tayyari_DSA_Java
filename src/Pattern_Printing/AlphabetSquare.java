package Pattern_Printing;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n ; j++) {
//                System.out.print((char) (i+64) + " ");
//            }
//            System.out.println();
//        }

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print((char) (i+96) + " ");
            }
            System.out.println();
        }
    }
}
