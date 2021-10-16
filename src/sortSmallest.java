public class sortSmallest {
    int[] randomArray;

    /**
     * method to find where the smallest index is located
     * @param arrayInput
     * @return
     */
    public int findSmallest(int[] arrayInput) {
        int smallest = arrayInput[0];
        int smallestIndex = 0;
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] < smallest) {
                smallest = arrayInput[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /**
     * this needs to be tested, attempting to use xor to swap the two indexes.
     * @param arr input array
     * @param newIndex where you want the original index to be placed
     * @param originalIndex original index location
     */
    public void swap(int[] arr, int newIndex, int originalIndex) {
        arr[newIndex] ^= arr[originalIndex];
        arr[originalIndex] ^= arr[newIndex];
        arr[newIndex] ^= arr[originalIndex];
    }

    /**
     * method to use the smallest index and swap it, ultimately sorting it.
     * @param arrayIn
     * @return
     */
    public int[] selectionSort(int[] arrayIn) {
        int[] newArray = new int[arrayIn.length];
        for (int j : arrayIn) {
            int smallestIndex = findSmallest(arrayIn);
            swap(newArray, 0, smallestIndex); // currently only adds to the front. not good
        }
    }

}
