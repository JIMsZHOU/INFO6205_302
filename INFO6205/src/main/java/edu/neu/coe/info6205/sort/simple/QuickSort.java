package edu.neu.coe.info6205.sort.simple;

import java.util.Arrays;

public class QuickSort<X extends Comparable<X>> extends Helper implements Sort<X> {
    @Override
    public void sort(X[] xs, int from, int to) {
        if (from >= to) return;
        int i = partition(xs, from, to);
        sort(xs, from, i - 1);
        sort(xs, i + 1, to);
    }

    private int partition(X[] xs, int lo, int hi) {
//        if (hi - lo == 0) return lo;
        swap(xs, lo, (int) (Math.random() * (hi - lo + 1)) + lo);
        int i = lo + 1;
        int j = hi;
        X comp = xs[lo];
        while (i < j) {
            while (less(xs[i], comp)) {
                i++;
            }
            while (less(comp, xs[j])) {
                j--;
            }
            if (i >= j) break;
            swap(xs, i, j);
        }

        swap(xs, lo, j);
        return j;
    }

    private static <X extends Comparable<X>> void swap(X[] xs, int i, int j) {
        X temp = xs[i];
        xs[i] = xs[j];
        xs[j] = temp;
    }



    public static void main(String[] args) {

    }
}

