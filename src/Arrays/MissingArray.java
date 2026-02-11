package Arrays;

public class MissingArray {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,8};
        int n = arr.length + 1;            // 1 to  n tak number honge array me koi ak nahi hoga
        int sum  =  n*(n+1)/2;
        int ArraySum = 0;
        for (int ele : arr) {
            ArraySum += ele;

            System.out.println(ele);

        }
    }

}
