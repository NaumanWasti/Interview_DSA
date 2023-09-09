import java.util.Scanner;

public class LinearSearch {
    static int[] arr={1,2,3,4,5};
    static String str="Nauman";
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        int searchFor=in.nextInt();
//        for(int a:arr){
//            if(a==searchFor){
//                System.out.println(a);
//            }
//        }
        Character search=in.next().charAt(0);
        for(int i=2;i<str.length();i++){
            if(str.charAt(i)==search){
                System.out.println(i);
            }
        }
    }
}
