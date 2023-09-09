import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagnolDifference {
    public static void main (String args[]){
        List<List<Integer>> arry  = new ArrayList<>();
        arry.add(Arrays.asList(1,2,3));
        arry.add(Arrays.asList(4,5,6));
        arry.add(Arrays.asList(9,8,9));
        System.out.println( diagonalDifference(arry) );
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < size; i++) {
            List<Integer> row = arr.get(i);
            primaryDiagonalSum += row.get(i);
            secondaryDiagonalSum += row.get(size - 1 - i);
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
}
