import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class assignment1 {
    public static void main(String[] args) {
        Map<String, double[]> algos = new HashMap<>();
        algos.put("bubble", getTimes("bubble"));
        algos.put("selection", getTimes("selection"));
        algos.put("insertion", getTimes("insertion"));
        algos.put("merge", getTimes("merge"));
        algos.put("quick", getTimes("quick"));

        try (FileWriter writer = new FileWriter("Sorting/data.txt", true)){
            for (String key : algos.keySet()){
                writer.write(key + ": ");
                writer.write(dataAsString(algos.get(key)));
                writer.write('\n');
            }
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }

    private static double[] getTimes(String algo){

        double[] times = new double[200];

        for (int i = 100; i <= 10_000; i += 100){
            int[] arr = Sorting.getRandom(100000, i);
            double time = getTime(algo, arr);
            times[(i / 100) - 1] = time;
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
                QuickSort sorted = new QuickSort(arr);
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

    private static String dataAsString(double[] arr){
        String newStr = "";

        for (int i = 0; i < arr.length; i++){
            if (i < arr.length - 1){
                newStr += arr[i] + ", ";
            }
            else {
                newStr += arr[i];
            }
        }

        return newStr;
    }
}
