package w5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationFinder {
    private List<Integer> list = new ArrayList<Integer>();

    public PermutationFinder(int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }

    public void randomize() {
        Collections.shuffle(list);
    }

    public List<Integer> get() {
        return list;
    }
}
