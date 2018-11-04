package edu.neu.coe.info6205.sort.simple;

import org.omg.PortableInterceptor.INACTIVE;

import static edu.neu.coe.info6205.sort.simple.Helper.less;
import static edu.neu.coe.info6205.sort.simple.Helper.swap;

public class SelectionSort<X extends Comparable<X>> implements Sort<X> {

    @Override
    public void sort(X[] xs, int from, int to) {
        // TODO implement selection sort
        for (int i = 0; i < xs.length; i++) {
            int minIndex = i;
            for (int j = i; j < xs.length; j++) {
                if (Integer.parseInt(xs[j].toString()) < Integer.parseInt(xs[minIndex].toString())) minIndex = j;
            }
            X temp = xs[i];
            xs[i] = xs[minIndex];
            xs[minIndex] = temp;
        }
    }
}
