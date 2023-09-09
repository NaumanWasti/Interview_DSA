
public class RotatedArray {
    static BinarySearch binarySearch=new BinarySearch();
    public static void main(String[] args){
        int[] arr={6,12,15,18,2,3};
        int key=4;
        System.out.println(rotationCount(arr)+1);
    }
    static  int maxEle(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<arr[start]){
                if(key>=arr[start] && key<arr[mid-1]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(key>arr[mid] && key<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    static  int rotationCount(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid!=0)
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]) return mid;
            if(arr[mid]<arr[start]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
