package Arrays;

import java.util.ArrayList;

public class ArrayListInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(23);
        arr.add(21);
        arr.add(22);
        arr.add(25);
        System.out.println(arr.get(2));      // arr[2]
        arr.set(3,50);         // for update arr index

        System.out.println(arr);

    }
}
