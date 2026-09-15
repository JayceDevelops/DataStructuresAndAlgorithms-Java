public class assignment1 {
    public static void main(String[] args) {
        String algo = "merge";
        double[] theTimes = getTimes(algo);
        printArray(theTimes);

    }

    private static double[] getTimes(String algo){

        double[] times = new double[300];

        for (int i = 1000; i <= 300_000; i += 1000){
            int[] arr = Sorting.getRandom(100000, i);
            double time = getTime(algo, arr);
            times[(i / 1000) - 1] = time;
        }

        return times;
    }

    // Helper function
    private static double getTime(String algo, int[] arr){
        long startTime = System.nanoTime();

        switch (algo){

            case "bubble" -> {
                Sorting.bubble(arr);
            }

            case "selection" -> {
                Sorting.selection(arr);
            }

            case "insertion" -> {
                Sorting.insertion(arr);
            }

            case "merge" -> {
                MergeSort sorted = new MergeSort(arr);
            }

            case "quick" -> {

            }
        }
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    private static void printArray(double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "    ");
        }
    }

}
