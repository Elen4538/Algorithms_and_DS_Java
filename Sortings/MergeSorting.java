public class MergeSorting {
    public static void main(String[] args) {

        int arr [] = {5,3,1,2,7,6,8};

        mergeSr(arr);

        for (int x: arr) {
            System.out.print(x + " ");
        }
    }


    private static void mergeSorting(int [] inputArray) {
        int inputLength = inputArray.length;
        if(inputLength<2) return;

        int midIndex = inputLength/2;

        int []leftHalf = new int [midIndex];
        int [] rightHalf = new int [inputLength-midIndex];
        //fill these arrays


//copy elements from original array to our left array
        for(int i=0;i <midIndex;i++) {
            leftHalf[i] = inputArray[i];
        }
        for(int i=midIndex;i < inputLength;i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }
        // recursively call mergeSr with left and right halves
        mergeSorting(leftHalf);
        mergeSorting(rightHalf);

        // merge two sorted halves together
        mergeHalves(inputArray,leftHalf,rightHalf);


    }

    private static void mergeHalves(int [] inputArray, int [] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        //we have 3 pointers to loop 3 arrays
        int i = 0, j = 0, k = 0;

        while(i<leftSize && j<rightSize) {
            if(leftHalf[i] <rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        //add left sorted elements
        while(i<leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j<rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
