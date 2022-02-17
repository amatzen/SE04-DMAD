package w7;

import w5.PermutationFinder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        PermutationFinder pf = new PermutationFinder(25);
        pf.randomize();
        List<Integer> test = pf.get();
        mergeSort(test, 0, test.size());
        System.out.println(test);
    }

    public static void merge(List<Integer> list, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        List<Integer> L = new ArrayList<>(n1+1);
        List<Integer> R = new ArrayList<>(n2+1);

        for (int i = 0; i < n1; i++) {
            L.set(i, list.get(p + i - 1));
        }

        for (int j = 0; j < n2; j++) {
            R.set(j, list.get(q + j));
        }

        L.add(Integer.MAX_VALUE);
        R.add(Integer.MAX_VALUE);

        int i = 0;
        int j = 0;

        for (int k = p; k < r; k++) {
            if (L.get(i) < R.get(j)) {
                list.set(k, list.get(i));
                i++;
            } else {
                list.set(k, R.get(j));
                j++;
            }
        }
    }

    public static void mergeSort(List<Integer> list, int p, int r) {
        if (p < r) {
            int q = (int)Math.floor((double)((p+r) / 2));
            mergeSort(list, p, q);
            mergeSort(list, q + 1, r);
            merge(list, p, q, r);
        }
    }
}
