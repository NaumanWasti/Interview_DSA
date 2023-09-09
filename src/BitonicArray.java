public class BitonicArray {
    static BinarySearch binarySearch = new BinarySearch();

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2};
        int target = 5;
        System.out.println(bitonicSearch(arr,target));
    }

    private static int bitonicSearch(int[] arr, int target) {
        if (arr[maxEleSearch(arr)] == target)
            return arr[maxEleSearch(arr)];
        else {
            int firstTry = binarySearch.search(arr, 0, maxEleSearch(arr), target);
            if(firstTry!=-1)
                return firstTry;
                else {
                int secondTry = binarySearch.search(arr, maxEleSearch(arr) + 1, arr.length - 1, target);
                return secondTry;
            }
        }
    }

    private static int maxEleSearch(int[] ints) {
        int start = 0;
        int end = ints.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (ints[mid] > ints[mid + 1] && ints[mid] > ints[mid - 1]) {
                return mid;
            } else if (ints[mid] < ints[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return -1;
    }

}
