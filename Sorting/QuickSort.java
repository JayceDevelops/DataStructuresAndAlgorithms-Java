public class QuickSort {
    public QuickSort(int[] arr, int low, int high){
        if (low >= high){
            return; // array of 1 is sorted
        }

        int pivot = arr[high];

        int counter = low; // Where to put the pivot

        for (int i = low; i < high; i++){
            if (arr[i] < pivot){
                Sorting.swap(arr, i, counter);
                counter++;
            }
        }

        // insert pivot in correct spot
        Sorting.swap(arr, counter, high);

        QuickSort(arr, low, counter - 1); // Left Side
        QuickSort(arr, counter + 1, high); // Right side
    }
}
