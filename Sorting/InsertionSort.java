package Sorting;

public class InsertionSort {
    private static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];

            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 6};

        System.out.println("Array before sorting: ");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Array after sorting: ");
        printArray(arr);
    }
}
