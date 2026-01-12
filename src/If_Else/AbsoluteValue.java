package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
//        int n = input.nextInt();
//        if (n>=0) {
//            System.out.println(n);
//        }
//
//            else System.out.println(-n);


        int n = input.nextInt();
        if(n < 0) n = -n;
        System.out.print(n);
        }
    }

