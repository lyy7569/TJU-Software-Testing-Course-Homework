import java.util.Arrays;

public class Main {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        System.out.println("Original Array:");
        printArray(arr);

        BubbleSort.bubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);

        int[] weights = {2, 3, 4};
        int[] values = {5, 5, 5};
        int capacity = 5;

        int[] result = BackPack.backPack(weights, values, capacity);

        System.out.println(Arrays.toString(result));
    }
}

