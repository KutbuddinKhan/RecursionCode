public class code_6_MergeSrot {

    public static void mergeSort(int[] data, int start, int end){
        if (start < end){
            int mid = (start + end) / 2;
            // divide the array into sub arrays
            mergeSort(data, start, mid); // left sub array
            mergeSort(data, mid + 1, end); // right sub array
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end){
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;  // k is a tracker variable
        
        // While both sub-arrays have values, try to merge them in sorted order

        while (i <= mid && j <= end){
            if (data[i] <= data[j]){
                temp[k++] = data[i++];
            }else{
                temp[k++] = data[j++];
            }
        }

        // Add the rest of the values from the left sub-array into the result
        while (i <= mid){
            temp[k++] = data[i++];
        }

        // Add the rest of the values from the right sub-array into the result
        while (j <= end){
            temp[k++] = data[j++];
        }

        // Copy values from temp back to data
        for (i = 0; i < temp.length; i++){
            data[start + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{-5, 20, 10, 3, 2 , 8};
        mergeSort(data, 0, data.length - 1);
        System.out.println("Sorted array:");
        for (int num: data){
            System.out.print(num + " ");
        }
    }
}
