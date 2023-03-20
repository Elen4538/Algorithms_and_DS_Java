public class Heap_Sort {
//Nlogn
    public static void main(String[] args) {
        // binary tree at the core
        int[] arr = {1000, 5, 7, 3, 2, 500, 13, 19, 123, -5};

        heapSort(arr);
        System.out.println("Heapsort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        //create tree
        for(int i = n / 2-1;i>=0;i--)
            heapify(arr,i,n);
         //sorting = take max element put it in the last place
        // and make heapify without last elem because it is maximum
        // each step we reduce quantity of the elements
        for(int i = n-1; i >=0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr,0, i);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        //parent is a max element with children = max heap
        //left child
        int l = i * 2 + 1;
        //right child
        int r = i * 2 + 2;
        // check
        int largest = i;
        if(l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if(r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        //swap
        if(i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // turn on heapify again because we changed  = order has changed
            heapify(arr, largest,n);
        }
    }


}
