import java.util.Scanner;

public class EvenNumberSearch {
    static int[] arr={123,2232,34,52352};
    public static void main(String[] args) {
        int value=0;
        for(int i:arr){
            int count=0;
            int val=i;
            while(val>0){
                val=val/10;
                count++;
            }
            if(count%2==0){
                value++;
            }
        }
        System.out.println(value);
        System.out.println(digits(690980));

    }
    static int digits(int num){
        return (int)(Math.log10(num))+1;
    }
}
