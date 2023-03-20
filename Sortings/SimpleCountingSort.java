public class SimpleCountingSort {

    public static void main(String[] args) {

        int[] data = {4, 2, 2, 8, 3, 3, 1};
        int size = data.length;
        int[] result = CountingSort.countSort(size, data);
        for (int n : result) {
            System.out.print(n + " ");

        }
    }
}

class CountingSort {

    static int[] countSort(int size, int[] array) {
        // find max element in the array
        // int max = Collections.max(Arrays.asList(array));
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        //or just define the scope MAX_VALUE = 100;

        int[] countArray = new int[max + 1];
        //fill additional array - store the count of each element
        for (int i = 0; i < size; i++) {
            countArray[array[i]]++;
        }

        int sortedArray[] = new int[size];
        int index = 0; // current position in array
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index] = i;
                index++;
            }
        }
        return sortedArray;

    }
}
