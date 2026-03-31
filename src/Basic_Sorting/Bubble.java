package Basic_Sorting;

public class Bubble {

    public static void main(String[] args) {

        int[]  arr = {2,33,-2,5,32,5};
        int  n = arr.length;
        print(arr);
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();
        print(arr);

    }
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

}
