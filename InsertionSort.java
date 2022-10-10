package searchandsort;
import java.util.*;
public class InsertionSort {

    public static void insertion(int []a, int n){
        if(n == 1)
            return;
        int i,j,key;
        for(i = 1; i < n; i++){
            j = i-1;
            key = a[i];
            while (j >= 0 && key < a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            int n = sc.nextInt();
            System.out.println("Enter the array element:");
            int []a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            System.out.println("The sorted array is:");
            insertion(a, n);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
