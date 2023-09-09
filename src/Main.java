import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] arr={1,2,3,4,5};
static int start=0;
static int end=arr.length-1;

    public static void main(String[] args) {
        while (start<end){
            swap(start,end);
            start++;
            end--;
        }
System.out.println(Arrays.toString(arr));
        }
        static void swap(int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        }

    }

