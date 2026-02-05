package Arrays;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr  = {-6, 4,32,56,-47};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max )  max = arr[i];
        }
        System.out.println(max);
    }
}
