package searchandsort;

import java.util.Scanner;

public class SelectionSort {
    public static void selection(int []a, int n){
        int min;//to store the index of minimum element
        for(int i=0; i<n-1; i++){
            min=i; //we need to update the value of min every time to i (important!)
            for(int j=i+1; j<n; j++){
                if(a[j] < a[min]){
                    min=j;
                }
            }
            swap(a,i,min);
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
            selection(a, n);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
