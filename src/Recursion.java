import java.util.ArrayList;
import java.util.List;

public class Recursion {
    static  ArrayList<Integer> arry= new ArrayList<Integer>();

    public static void main(String[] args){
//        System.out.println(isSorted(arrayList,0));
//        System.out.println(findIndex(arrayList,0,10));
        ArrayList<Integer> arrayList=new ArrayList<>(List.of(1,2,3,4,4,5,0,6,7,8,9));
        System.out.println(findIndexMultipleComplex(arrayList,0,4));
    }
    static boolean isSorted(List<Integer> arr, int index){
        if(index==arr.size()){
            return true;
        }
        return arr.get(index) < arr.get(index + 1) && isSorted(arr,index+1);
    }
    static int findIndex(List<Integer> arr, int index,int target){
        if(index==arr.size()){
            return -1;
        }
        if(arr.get(index)==target){
            return index;
        }
        else{
            return findIndex(arr,index+1,target);
        }
    }

    static void findIndexMultiple(List<Integer> arr, int index,int target){

        if(index==arr.size()){
            return ;
        }
        if(arr.get(index)==target){
            arry.add(index);
        }
         findIndexMultiple(arr,index+1,target);
    }
    static ArrayList<Integer> findIndexMultipleComplex(List<Integer> arr, int index,int target) {
        ArrayList<Integer> arrys= new ArrayList<>();
        if(index==arr.size()){
            return arrys ;
        }
        if(arr.get(index)==target){
            arrys.add(index);
        }
        ArrayList<Integer> belowList= findIndexMultipleComplex(arr,index+1,target);
        arrys.addAll(belowList);
        return  arrys;
    }
}
