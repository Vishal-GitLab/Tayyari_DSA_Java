package Pattern_Printing;

import java.util.Scanner;

public class StarTriangleHoriFlipped {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
           // for (int j =n; j >=i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        int n = input.nextInt();
//
//        int  a = n; // no of stars to be printed to each line
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=a; j++) {
//                System.out.print("* " + " ");
//            }
//            a--;
//            System.out.println();
//        }
    }
}
