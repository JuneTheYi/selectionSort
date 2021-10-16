public class sortSmallest {
    int[] randomArray;

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

}
