import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args){
        ArrayList<Integer> arrayList=new ArrayList<>(List.of(1,2,3,4,5,0,6,7,8,9));
//        System.out.println(isSorted(arrayList,0));
        System.out.println(findIndex(arrayList,0,10));
    }
    static boolean isSorted(List<Integer> arr, int index){
        if(index==arr.size()-1){
            return true;
        }
        return arr.get(index) < arr.get(index + 1) && isSorted(arr,index+1);
    }
    static int findIndex(List<Integer> arr, int index,int target){
        if(index==arr.size()-1){
            return -1;
        }
        if(arr.get(index)==target){
            return index;
        }
        else{
            return findIndex(arr,index+1,target);
        }
    }
}
