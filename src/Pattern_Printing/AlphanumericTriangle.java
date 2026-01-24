package Pattern_Printing;

import java.util.Scanner;

public class AlphanumericTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
                System.out.print((char)(j+64)+" " );
            }
            System.out.println();
        }
    }
}
