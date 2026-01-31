package Arrays;

import java.util.Scanner;

public class NegativePrintArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();


            // printing negative value
        for (int i = 0; i < n; i++)
            if (arr[i] < 0) System.out.print(arr[i]+ " ");


        }
    }

