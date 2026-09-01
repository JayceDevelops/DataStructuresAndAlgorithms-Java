public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Print Array
        ArrayFunctions.printArray(arr);

        // Is Empty 
        System.out.println(ArrayFunctions.isEmpty(arr));

        // Copy Array
        ArrayFunctions.printArray(ArrayFunctions.copy(arr));

        // Is Equal
        System.out.println(ArrayFunctions.isEqual(arr, ArrayFunctions.copy(arr)));

        // Random Array
        int[] arr2 = ArrayFunctions.getRandom(10, 10);
        ArrayFunctions.printArray(arr2);

        // Max Int
        System.out.println(String.valueOf(ArrayFunctions.max(arr2)));
        
        // Min Int
        System.out.println(String.valueOf(ArrayFunctions.min(arr2)));

        // Exists
        System.out.println(String.valueOf(ArrayFunctions.exists(arr2, 8)));
    }
    
}
