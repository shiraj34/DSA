package searchandsort;
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int []arr = {100,360,-2,3,5,10};
        int index = search(arr,10);
        System.out.println(index);
    }

    public static int search(int []arr, int key) {
        int lo=0,hi=arr.length-1;
        while(hi >= lo) {
            int mid = (lo + hi) / 2;
            if(arr[mid] == key) {
                return mid;
            }
            if (arr[lo] <= arr[mid]) {
                if(arr[lo] <= key && key < arr[mid]){
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            } else {
                if(arr[mid] < key && key <=arr[hi]) {
                    lo = mid+1;
                } else {
                    hi= mid-1;
                }
            }
        }
        return -1;
    }
}
