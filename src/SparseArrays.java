import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>(List.of(
                "4","aba","baba","aba","xzxb","3"
        ));
        List<String> queries=new ArrayList<>(List.of(
                "aba","xzxb","ab"
        ));
        System.out.println(matchingStrings(strings,queries));

    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int count=0;
            for (int j = 0; j < strings.size(); j++) {
                if(queries.get(i).equals(strings.get(j))){
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }
}
