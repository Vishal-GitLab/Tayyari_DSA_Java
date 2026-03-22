package Recursion;

public class GlobalVariable {
    static  int x =  10;        // this variable can be accessable for every method
    // static --->> shareable to variable every method single variable
    // global variable,  function ke bahar hota h
    public static void main(String[] args) {
        fun(x);
        x  = 9; // change
        System.out.println(x);
         int x  = 4;      // local variable and dec
        System.out.println(x);
        x  =6;
        System.out.println(x);
    }
    public static void fun(int x ) {
        x = 20;
     }
}
