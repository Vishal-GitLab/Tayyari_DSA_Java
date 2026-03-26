package Recursion;

public class Recursion {
    public  static int  reverse(int n ,int m) {
        if(n==0)  return 0;
        return reverse(n/10,m*10 + n%10);
    }
    public static void main(String[] args) {
        int n = 234234;
        System.out.println(reverse(n,0));

    }
}
