package Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        // product of array
        int arr[] = {3,7,3,8};
        int product  = 1;
        for (int i = 0; i < arr.length ; i++) {
            product *= arr[i];
        }
        System.out.println(product);

    }
}
