package searchandsort;
/*We are given a sorted and rotated array. We need to find the minimum element.
* We use Binary search algorithm.*/
public class MinSortRot {
    public static void main(String[] args) {
        int[] arr = {9,10,0,2,3,4,5,6};
        int min = findMin(arr);
        System.out.println("The minimum element is : " + min);
    }

    private static int findMin(int[] arr) {
        if(arr.length == 1) return arr[0];
        return recursion(arr,0,arr.length-1);
    }

    private static int recursion(int[] arr, int l, int r) {
        if(l == r) return arr[l];
        if(r-l == 1) return Math.min(arr[l],arr[r]);
        int mid = l + (r-l)/2;
        if(arr[l] < arr[mid]) {
            return recursion(arr,mid+1, r);
        }
        return recursion(arr,l,mid-1);
    }
}
