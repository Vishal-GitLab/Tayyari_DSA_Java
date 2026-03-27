package Recursion;

import java.util.ArrayList;

public class StringOnArray {
    public static void main(String[] args) {
        String[] arr  = {"Vishal","Krish","Hemant","Chaurasiya"};
        ArrayList<String> al  = new ArrayList<>();
        al.add("Rahul");
        al.add("Vikas");
        al.add("Ganesh");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al) {
        al.add("Ankit");
    }


//    public static void change(String s) {
//         s  = "Lavish";
//      }

}
