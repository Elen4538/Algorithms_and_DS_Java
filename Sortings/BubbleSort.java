public class BubbleSort {
    static void bubbleSorting(int arr[]) {
        int size = arr.length;

        for(int i = 0; i < size-1; i++) {
            for(int j = 0; j < size-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
    
        int data[] = {56,23,1,8,6,9};
        
        //call method using class name
        BubbleSort.bubbleSorting(data);
        
        for(int i=0; i<data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
