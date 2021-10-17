public class quickSort {

    public int[] quickSort(int[] array) {
        if (array.length < 2) {
            return array;
        } else {
            int pivot = array[0];
            // less = [i for i in array[1:] if i <= pivot] // sub-array of all the elements less than the pivot

            // greater = [i for i in array[1:] if i > pivot] // sub-array of all the elements greater than the pivot
            return quicksort(less) + [pivot] + quicksort(greater);
        }

    }

}
