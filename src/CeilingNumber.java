public class CeilingNumber {
    public static void main(String[] args) {
       // ceiling(new int[]{1, 3, 5, 6, 9, 22, 24},6,false);
        System.out.println(ceiling(new int[]{1, 3, 5, 6, 9, 22, 24},4,true));
    }
    static int ceiling(int[] arr,int target,boolean floor){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target)
                end=mid-1;
            else if(arr[mid]<target)
                start=mid+1;
            else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
