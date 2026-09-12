


public class assignment1 {
    public static void main(String[] args) {
        String algo = "bubble";
        double[] theTimes = getTimes(algo);
        printArray(theTimes);

    }

    private static double[] getTimes(String algo){

        double[] times = new double[10];

        for (int i = 10_000; i <= 100_000; i += 10000){
            int[] arr = Sorting.getRandom(1000, i);
            double time = getTime(algo, arr);
            times[(i / 10000) - 1] = time;
        }

        return times;
    }

    // Helper function
    private static double getTime(String algo, int[] arr){
        long startTime = System.nanoTime();
        if ("bubble".equals(algo)){
            Sorting.bubble(arr);
        }
        long endTime = System.nanoTime();

        return ((endTime / startTime) / 1_000_000_000.0);
    }

    private static void printArray(double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "    ");
        }
    }

}
