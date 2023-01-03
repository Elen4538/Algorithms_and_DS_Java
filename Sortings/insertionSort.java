public class insertionSort {
  
    static void SortArr(int arr[]){
        int size = arr.length;
        for(int step=1; step < size;step++) {
            int key = arr[step];
            int j = step - 1;

            while((j >=0)&&(key < arr[j])) {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }

    }

    public static void main(String args[]) {
        int [] data = {65,0,3,5,8,32};
        insertionSort obj1 = new insertionSort();
        obj1.SortArr(data);

        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}
