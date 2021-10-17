public class sortSmallest {
    int[] randomArray;

    /**
     * method to find where the smallest index is located
     * @param arrayInput
     * @return
     */
    public int findSmallest(int[] arrayInput) {
        int smallest = arrayInput[0]; //stores the smallest value
        int smallestIndex = 0; // stores the index of the smallest value
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
    public int[] selectionSort(int[] arrayIn) { //sorts an array
        int[] newArray = new int[arrayIn.length];
        for (int j : arrayIn) {
            int smallestIndex = findSmallest(arrayIn); // finds the smallest element in the array, and adds it to the new array
            swap(newArray, 0, smallestIndex); // currently only adds to the front. not good
        }
        return newArray;
    }

}
