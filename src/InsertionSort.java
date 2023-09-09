import java.util.Arrays;

public class InsertionSort {
    public  static void main(String args[]){
        int[] arr = {15,12,9,0,31,4,4,2,9,0,2,3,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = temp;
    }
}
