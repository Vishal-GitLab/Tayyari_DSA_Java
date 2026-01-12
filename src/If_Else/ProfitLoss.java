package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your CP: ");
        int cp = input.nextInt();
        System.out.println("Enter your SP: ");
        int sp  = input.nextInt();

        if (sp > cp ) System.out.println("Profit" + (sp-cp));
        if (cp > sp ) System.out.println("Profit" + (cp-sp));
        if (sp == cp ) System.out.println("No profit No loss");
    }
}
