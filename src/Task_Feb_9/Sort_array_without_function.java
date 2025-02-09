package Task_Feb_9;

public class Sort_array_without_function {
    public static void main(String[] args){
        int[] arr = {12, 34, 10, 1, 100, 3, 4, 32};
        for (int i = 0; i < arr.length - 1; i++) {  // Outer loop
            for (int j = 0; j < arr.length - 1 - i; j++) {  // Inner loop
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
