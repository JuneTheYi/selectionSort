import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {
        int[] arr =  {5, 13, 9, 2, 6, 7, 8, 3, 4};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }

    // Kunal Kushwaha
    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) { // loops and flips every number on start and end around pivot number
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        //now my pivot is at correct index, please sort two halves now
        sort(nums, low, end);
        sort(nums, start, hi);
    }

//    public int[] quickSort(int[] array) {
//        if (array.length < 2) {
//            return array;
//        } else {
//            int pivot = array[0];
//            // less = [i for i in array[1:] if i <= pivot] // sub-array of all the elements less than the pivot
//
//            // greater = [i for i in array[1:] if i > pivot] // sub-array of all the elements greater than the pivot
////            return quicksort(less) + [pivot] + quicksort(greater);
//        }
//        return array;
//    }

}
