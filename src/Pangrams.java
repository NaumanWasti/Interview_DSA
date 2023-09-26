import java.util.List;

public class Pangrams {
    public static void main(String[] args){
System.out.println(pangrams("The quick brown fox jump over the lazy dog"));
    }
    public static String pangrams(String s) {
        if(s.length()<26) return "not anagram";
        s=s.trim().toUpperCase();
        s = s.replaceAll("\\s+", "");
        System.out.println(s.length());
        for (int i = 65; i <= 90; i++) {
            int k=0;
            for (int j = 0; j < s.length(); j++) {
                if(i!=s.charAt(j)){
                    k++;
                }
            }
            System.out.println(k);
            if(k==s.length()){
                return "not anagram";
            }
        }
        return "anagrame";
    }
   
}
