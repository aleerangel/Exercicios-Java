public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 0, 3, 1, 6, 8};
        int[] arr2 = {4, 2, 0, 3, 1, 6, 8};

        System.out.println("Before sort: ");
        printArray(arr1);

        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr1);
        System.out.println("Bubble Sort: ");
        printArray(arr1);

        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr2);
        System.out.println("Selection Sort: ");
        printArray(arr2);
    }

    private static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}