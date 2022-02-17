package w5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        int maxVal = 25;

        PermutationFinder pf = new PermutationFinder(maxVal);
        pf.randomize();
        System.out.println(pf.get());
    }
}

class PermutationFinder {
    private List<Integer> list = new ArrayList<Integer>();

    public PermutationFinder(int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }

    public void randomize() {
        Collections.sort(list);
    }

    public List<Integer> get() {
        return list;
    }
}
