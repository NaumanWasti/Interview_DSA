import java.util.ArrayList;

public class FirstAndLastPos {
        public static void main(String[] args) {
           System.out.println(firstLastPos(new int[]{1, 1, 1,1,1,1,3,3,3,3, 5,6,8,9},10));
        }
        static ArrayList<Integer> firstLastPos(int[] arr, int target){
            ArrayList<Integer> ans=new ArrayList<>();
            int start=0;
            int firstPos=-1;
            int lastPos=-1;
            int end=arr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]>target)
                    end=mid-1;
                else if(arr[mid]<target)
                    start=mid+1;
                else {
                    firstPos=mid;
                    end=mid-1;
                }
            }
            ans.add(firstPos);
             start=0;
             end=arr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]>target)
                    end=mid-1;
                else if(arr[mid]<target)
                    start=mid+1;
                else {
                    lastPos=mid;
                    start=mid+1;
                }
            }
            ans.add(lastPos);
            if(lastPos==firstPos)
                ans.remove(0);
            return ans;
        }
    }

