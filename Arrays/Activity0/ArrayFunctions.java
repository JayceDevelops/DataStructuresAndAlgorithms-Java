

public class ArrayFunctions {

    public static void printArray(int[] arr) {

        if (arr.length == 0){
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; ++i){
            if (i < arr.length - 1){
                System.out.print(String.valueOf(arr[i]) + ", ");
            }
            else {
                System.out.print(String.valueOf(arr[i]));
            }
        }
        System.out.println("]");
    }

    public static boolean isEmpty(int[] arr){
        return arr.length == 0;
    }

    public static int[] copy(int[] arr){
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; ++i){
            copy[i] = arr[i];
        }

        return copy;
    }

    public static boolean isEqual(int[] arr, int[] arr2){

        if (arr.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr.length; ++i){
            if (arr[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }

    /**
     * 
     * @param max The maximum value for any element in the array
     * @param length The length of the array
     * @return int[]
     */
    public static int[] getRandom(int max, int length){
        int[] randomArr = new int[length];

        for (int i = 0; i < length; ++i){
            randomArr[i] = (int) Math.round(Math.random() * max);
        }

        return randomArr;
    }

    /**
     * 
     * @param arr
     * @return
     */
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; ++i){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * 
     * @param arr
     * @return
     */
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; ++i){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static boolean exists(int[] arr, int value){
        for (int i = 0; i < arr.length;  ++i){
            if (arr[i] == value){
                return true;
            }
        }

        return false;
    }

}