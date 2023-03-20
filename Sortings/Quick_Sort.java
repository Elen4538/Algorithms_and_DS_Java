public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {1000, 5, 7, 3, 2, 500, 13, 19, -5};
        quickSort(arr, 0, arr.length - 1);

        System.out.println("QuickSort:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int pivot = partition(arr, l, r);
        //pivot element remains its place
        quickSort(arr, l, pivot - 1);
        quickSort(arr, pivot + 1, r);
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int ptr = l - 1;

        for (int i = l; i < r; i++) {
            if (arr[i] < pivot) {
                ptr++;
                swap(ptr, i, arr);
            }

        }
        swap(ptr + 1, r, arr);
        return ptr + 1;

    }
    private static void swap(int ptr, int i, int[] arr) {
        int temp = arr[ptr];
        arr[ptr] = arr[i];
        arr[i] = temp;
    }

}
