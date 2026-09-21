public class QuickSort {
    public QuickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; 
        }
        quickSort(arr, 0, arr.length - 1);
    }

    
    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = arr[high];
        int counter = low;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, counter);
                counter++;
            }
        }

        
        swap(arr, counter, high);

        quickSort(arr, low, counter - 1);   // left side
        quickSort(arr, counter + 1, high);  // right side
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
