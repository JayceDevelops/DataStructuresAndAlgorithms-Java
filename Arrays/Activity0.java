

public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};

    printArray(nums);
    System.out.println(isEmpty(nums));
}

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
    for (int i = 0; i < arr.length;){
        return false;
    }
    return true;
}