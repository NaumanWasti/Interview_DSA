import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("kach", "hck"));
        List<String> queries = new ArrayList<>(List.of("hack", "check"));
        System.out.println(stringAnagram(strings, queries));
        System.out.println(findSubstring("caberqiitefgadsjh",5));
    }

    public static List<Integer> stringAnagram(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();

        for (String query : queries) {
            // Sort the characters in the query string.
            char[] sortedQuery = query.toCharArray();
            Arrays.sort(sortedQuery);
            String sortedQueryStr = new String(sortedQuery);

            int anagramCount = 0;

            for (String str : strings) {
                // Sort the characters in the current string.
                char[] sortedStr = str.toCharArray();
                Arrays.sort(sortedStr);
                String sortedStrStr = new String(sortedStr);

                // Compare the sorted strings to check for anagrams.
                if (sortedQueryStr.equals(sortedStrStr)) {
                    anagramCount++;
                }
            }

            result.add(anagramCount);
        }

        return result;
    }

    public static String findSubstring(String s, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        String sub="";
        String sub2;
        int d=k;
        if(s.length()>=k) {
            sub2=s.substring(k-d,k);
            for (int i = 0; i < s.length(); i++) {
                if (sub2.length() >= k) {
                    arr.add(countVowel(sub2));
                    d = d + k;
                    if(s.length()>d+k)
                    sub = s.substring(d-k, d);
                    sub2 = sub;
                }
            }
        }
        return "";

    }

    public static Integer countVowel(String sub) {
        int count=0;
        List<Character> vowel = new ArrayList<>(List.of('a', 'e','i','o','u'));
        for (int i = 0; i < sub.length() ;i++) {
            if(vowel.contains(sub.charAt(i))){
                count++;
            }
        }
        return count;
    }

}
