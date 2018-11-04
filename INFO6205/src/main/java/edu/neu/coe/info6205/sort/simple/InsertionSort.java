package edu.neu.coe.info6205.sort.simple;

import static edu.neu.coe.info6205.sort.simple.Helper.less;
import static edu.neu.coe.info6205.sort.simple.Helper.swap;

public class InsertionSort<X extends Comparable<X>> implements Sort<X> {
    @Override
    public void sort(X[] xs, int from, int to) {
        // TODO implement insertionSort
        for (int i = 0; i < xs.length; i++) {
            for (int j = 0; j < i; j++) {
                if (Integer.parseInt(xs[i].toString()) > Integer.parseInt(xs[j].toString())) {
                } else {
                    for (int k = j; k < i; k++) {
                        X temp = xs[k];
                        xs[k] = xs[i];
                        xs[i] = temp;
                    }
                }
            }
        }
    }
}
