// This sorting technique sorts array in one loop, hence the time complexity is O(n). But this sorting
// technique can only be used when array contains number from (1-n) or (0-(n-1)) that is continuous numbers.
package searchandsort;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int i=0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]) {
                swap(arr,i,correct);
            }
            i++;
        }
    }
    public static void swap(int[] arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
