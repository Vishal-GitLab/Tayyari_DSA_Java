package Recursion;

public class TowerHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        hanoi(n-1,a,c,b);   // n-1 disks from A to B via c
        System.out.println(a+"->"+c);   // largest from A to C
        hanoi(n-1,b,a,c);    // n-1 disks from B to C via A
    }
}
