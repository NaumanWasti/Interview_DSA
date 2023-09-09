import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Median {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>(List.of(2,5,2,9,6,2,3,6,9,1, 13));
        findMedian(arr);
    }
    public static int findMedian(List<Integer> arr) {
        Integer[] arr2=arr.toArray(new Integer[0]);
        Arrays.sort(arr2);
        int med=(arr2.length+1)/2;
        System.out.println(Arrays.stream(arr2).toList());
        System.out.println(arr2[med-1]);
return 0;
    }
}
