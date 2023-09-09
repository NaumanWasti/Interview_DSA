import java.util.Arrays;
import java.util.Scanner;

public class PersonAWealth2DArray {
    static int sum=0;
    public static void main(String[] args) {
        int[][] acc={{1,2,3},{3,2,1,2}};
        richestPerson(acc);
    }

    private static void richestPerson(int[][] acc) {
int tot=0;
int richest=0;
        for(int row=0;row< acc.length;row++){
            sum=0;
            for(int col:acc[row]){
                sum=col+sum;
            }
            if(sum>tot) richest=sum;
            tot=sum;
        }
        System.out.println("richest person is "+richest);

    }
}
