public class MergeSort {
    
    private final int[] temp, array;

    public MergeSort(int[] arr) {
        this.array = arr;
        this.temp = new int[arr.length];

        split(0, arr.length - 1);
    }

    private void split(int low, int high){

        if (low == high){
            return;
        }

        int mid = (low + high) / 2;

        split(low, mid);
        split(mid + 1, high);

        merge(low, mid, high);
    }

    private void merge(int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int temppos = low;

        while(i <= mid && j <= high){
            if(this.array[i] <= this.array[j]){
                this.temp[temppos++] = array[i++];
            }
            else {
                this.temp[temppos++] = array[j++];
            }
        }

        // Run out rest of left
        while (i <= mid){
            this.temp[temppos++] = array[i++];
        }

        // Run out rest of right
        while (j <= high){
            this.temp[temppos++] = array[j++];
        }

        // Copy out sorted temporary array into the original array
        for (temppos = low; temppos <= high; temppos++){
            this.array[temppos] = this.temp[temppos];
        }
    }   
}
