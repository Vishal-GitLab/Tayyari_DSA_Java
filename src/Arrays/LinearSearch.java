package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[]  arr = {10,20,30,40,50};
        int target  = 30;
        int found = -1;    // -1  means target array me nahi hai
        for (int i =1; i < arr.length ; i++) {
            if (arr[i] == target) {
                found = i;             // any number except -1 means target array me hai
                break;
            }
        }
        if (found != -1) System.out.println("Target exists in array at index " + found);
        else System.out.println("Target exists in Array");
    }
}
