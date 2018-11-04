package edu.neu.coe.info6205.sort.simple;

import java.util.Arrays;

public class Mergesort {
    private static int[] aux;
     private static void merge(int[] a, int lo, int mid, int hi) {
        for (int i = lo; i < hi + 1; i++) {
            aux[i] = a[i];
        }
        int left = lo, right = mid + 1;

        for (int i = lo; i < hi + 1; i++) {
            if (left > mid) {
                a[i] = aux[right];
                right++;
            } else if (right > hi) {
                a[i] = aux[left];
                left++;
            } else if (aux[left] < aux[right]) {
                a[i] = aux[left];
                left++;
            } else {
                a[i] = aux[right];
                right++;
            }
        }
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = (lo + hi) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length -1);
    }

    public static void main(String[] args) {
        int[] a = {5,4,3,3,5,6,7,8,7,6,6,7,9,9,9,6,5,3,2,2,3,4,2,2,2,2,2,0,0,8,5,8,0,4,2,1,1,4,6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
