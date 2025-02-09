package Task_Feb_9;

import java.util.Arrays;

public class Second_smallest_number_Array {
    public static void main(String[] args) {
        int[] arr={10,3,2,50,60,20,5,1,7};
        Arrays.sort(arr);
        System.out.println("Second largest number in array = "+arr[1]);
    }
}
