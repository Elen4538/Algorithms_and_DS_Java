public class SelectionSort {
    public int[] sort(int[] arr, int n) {
        if (n == 1) return arr;
        else {
            for (int i = 0; i < n - 1; i++) {
                int minInd = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[minInd] > arr[j]) {
                        minInd = j;
                    }
                }
                //swap
                int temp = arr[minInd];
                arr[minInd] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
