package edu.neu.coe.info6205.sort.simple;

import java.util.Arrays;

public class Threeways_QuickSort <X extends Comparable<X>> extends Helper implements Sort<X>{

    class Partition {
        int lt;
        int gt;
        Partition(int lt, int gt) {
            this.lt = lt;
            this.gt = gt;
        }
    }

    @Override
    public void sort(X[] xs, int from, int to) {

            if (from >= to) return;
            Partition p = partition(xs, from, to);
            int lt = p.lt;
            int gt = p.gt;
            sort(xs, from, lt - 1);
            sort(xs, gt + 1, to);
    }

    private Partition partition(X[] xs, int lo, int hi) {
        int i = lo +1;
        int j = hi;

        while (i < j) {
            while (less(xs[i], xs[lo])) i++;
            while (less(xs[lo], xs[j])) j++;
            if (i >= j) break;
            swap(xs, lo, hi, i, j);
        }
        swap(xs, lo, hi, lo, j);

        int lt = j - 1;
        int gt = j + 1;
        int left = lo;
        int right = hi;
        while (left < lt) {
            if (xs[left].equals(xs[j])) {
                swap(xs, lo, hi, left, lt);
                left++;
                lt --;
            } else {
                left++;
            }
        }

        while (right > gt) {
            if (xs[right].equals(xs[j])) {
                swap(xs, lo, hi, right, gt);
                right--;
                gt++;
            } else {
                right--;
            }
        }
        return new Partition(left, right);
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{4,4,4,3,6,6,8,3,4,8,3};
        Threeways_QuickSort<Integer> tq =  new Threeways_QuickSort<Integer>();
        tq.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
