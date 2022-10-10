package searchandsort;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array:");
            int n = sc.nextInt();
            System.out.println("Enter array element:");
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            System.out.println("The sorted array is:");
            quicksort(a, 0, n-1);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

    private static void quicksort(int[] a, int i, int i1) {
    }
}
