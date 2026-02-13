package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(23);
        arr.add(21);
        arr.add(22);
        arr.add(25);
        System.out.println(arr.get(2));      // arr[2]
        arr.set(3,50);         // for update arr index

        System.out.println(arr);              // not traversing array by ourselves
        int n = arr.size();     // array list ki length nhi hoti hai size hoti hai
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+ " ");
        }

        System.out.println();
        for (int ele : arr) {
            System.out.print(ele +  " ");
        }
        arr.add(78);
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
