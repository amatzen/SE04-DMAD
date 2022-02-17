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

