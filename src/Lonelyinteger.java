import java.util.ArrayList;
import java.util.List;

public class Lonelyinteger {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 3, 2, 1,0,3,6,7,8));
        System.out.println(lonelyInteger(arr));
    }

    public static int lonelyInteger(List<Integer> a) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for (int num : a) {
            if(arr.contains(num)){
                arr.remove(arr.indexOf(num));
            }
            else{
                arr.add(num);
            }
        }
        return arr.get(0);
    }
}
