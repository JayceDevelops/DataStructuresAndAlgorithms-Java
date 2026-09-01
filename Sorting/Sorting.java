public class Sorting {

    public static void main(String[] args){
        int[] nums = {12, 2, 5, 20, 9, 10};
        bubble(nums);
        print(nums);

        //nums = {12, 2, 5, 20, 9, 10};
        selection(nums);
        print(nums);
    }

    // Prints an array
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Bubble Sort
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; ++i){
            for (int j = 0; j < arr.length - i - 1; ++j){
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Selection Sort
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; ++i){
            
            // The index of the smallest value found
            int min = i;

            // loop through the remaining elements in the array and record
            // The smallest values index.
            for (int j = i + 1; j < arr.length; ++j){
                // Find the smallest
                if (arr[j] < arr[min]){
                    min = j; // Update smallest element index
                }
            }
            
            swap(arr, min, i);
        }
    }

    // Insertion Sort
    public static void insertion(int[] arr){
        for (int i = 1; i < arr.length; ++i){

            int current = arr[i];
            int j = i - 1;

            // walk back through the array and shift elements until we get a smaller element
            while (j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j]; // shift to the right
                j--; // push left back to the front
            }
            arr[j + 1] = current;
        }
    }

    public static void swap(int[] arr, int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
