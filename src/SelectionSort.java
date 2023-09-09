import java.util.Arrays;

public class SelectionSort {
    public  static void main(String args[]){
        int[] arr = {15,12,9,0,31,4,4,2,9,0,2,3,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int end= arr.length - i-1;
            int max=getMaxIndex(0,end,arr);
            swap(end,max,arr);
        }
    }
    private static int getMaxIndex(int start,int end,int[] arr) {
        int max=start;
        for (int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    private static void swap(int end, int max, int[] arr) {
        int temp=arr[end];
        arr[end]=arr[max];
        arr[max]=temp;
    }

    }