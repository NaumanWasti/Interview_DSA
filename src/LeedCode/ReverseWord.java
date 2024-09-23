package LeedCode;

import java.util.ArrayList;
import java.util.List;

public class ReverseWord {

    public static void main(String[] args) {
        String value = reverseWords("  this is not   nauman  ");
        System.out.println(value);
    }
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int strLenght = str.length - 1;
        StringBuilder  out = new StringBuilder();
        for (int i = strLenght; i > 0; i--) {
            out.append(str[i]) ;
            out.append(" ");
        }
        return out + str[0];
    }
}
