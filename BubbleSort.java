package searchandsort;
import java.util.Scanner;
public class BubbleSort {
    public static void bubble(int[] a, int n) {
        for(int i=0; i<n;i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j+1] < a[j]){
                    swap(a,j,j+1);
                }
            }
        }
    }
    public static void swap(int []a, int b, int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
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
            bubble(a, n);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

