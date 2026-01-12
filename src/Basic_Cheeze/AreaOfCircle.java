package Basic_Cheeze;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double p = 3.14;
//        int r  = 7;
//        System.out.println(p*(r*r));

        double  r = sc.nextDouble();
        double a = 3.141592 * r *r;
        System.out.println(a);
    }
}
