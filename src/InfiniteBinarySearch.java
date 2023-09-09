public class InfiniteBinarySearch {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2,3,4,4,5,6,7,8,8,9,10,11,12},10));

    }
static int find(int[] arr,int target){
    int start=0;
    int end=1;
    while(target>arr[end]){
        int newstart=end+1;
        end=end*2;
        start=newstart;
    }
    return search(arr,target,start,end);
}
    private static int search(int[] ints, int i,int start,int end) {

        while(start<=end){
            int mid=(start+end)/2;
            if(ints[mid]>mid){
                end=mid-1;
            }
            else if(ints[mid]<mid){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
         return end;

    }

}
