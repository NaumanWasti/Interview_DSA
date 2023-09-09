import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    static boolean swapped=false;

    public static void main(String[] args) {
        int[] arr = {15,12,9,0,31,4,4,2,9,0,2,3,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }





    private static void bubbleSort(int[] arr) {
        for (int j=0;j<arr.length;j++){
            swapped=false;
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i);
                }
            }
            if(!swapped){
                break;
            }
        }

    }

    private static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = temp;
        swapped=true;
    }
}
