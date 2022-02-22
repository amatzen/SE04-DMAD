package w5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        int maxVal = 25;

        PermutationFinder pf = new PermutationFinder(maxVal);
        pf.randomize();
        System.out.println(pf.get());
    }

    private static int countCycles(List<Integer> list) {
        int count = 0;

        List<Integer> checked = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            if (checked.contains(i)) {
                continue;
            }

            for (int j = list.get(i); j != i; j = list.get(j)) {
                checked.add(j);
            }
            count++;
        }

        return count;
    }
}
