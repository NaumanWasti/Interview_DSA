
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int[] arr2 = {1, 2, 3, 4};
        int start = 0;
        int end = arr.length;
        int val = 3;
        System.out.println(search(arr2, start, end, val));
    }

    public static int search(int[] arr, int start, int end, int val) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == val) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > val) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < val) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
