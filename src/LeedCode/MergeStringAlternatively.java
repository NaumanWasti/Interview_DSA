package LeedCode;

public class MergeStringAlternatively {
    public  static void main(String[] args){
        String value = mergeStringsApproach2("ab","pqrs");
        System.out.println(value);
    }

    public  static String mergeStrings(String s1,String s2){
        StringBuilder merged = new StringBuilder();
        String longest = s1.length()>s2.length() ? s1 : s2;
        String shortest = s1.length()<s2.length() ? s1 : s2;
        for (int i = 0; i < longest.length(); i++) {
            if(shortest.length()>i){
                merged.append(String.valueOf(s1.charAt(i)) + String.valueOf(s2.charAt(i)));
                continue;
            }
            String remaining = longest.substring(i);
            merged.append(remaining) ;
            break;
        }
        return merged.toString();
    }
    public  static String mergeStringsApproach2(String s1,String s2){
        StringBuilder merged = new StringBuilder();
        int s1Length = s1.length();
        int s2Length = s2.length();

        for(int i = 0; i < s1Length || i < s2Length ; i++){
            if(i<s1Length){
                merged.append(s1.charAt(i));
            }
            if(i<s2Length){
                merged.append(s2.charAt(i));
            }
        }
        return merged.toString();
    }
}
